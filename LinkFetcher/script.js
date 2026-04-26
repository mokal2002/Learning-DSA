// DOM Elements
const urlInput = document.getElementById('url-input');
const linkTypeSelect = document.getElementById('link-type');
const fetchBtn = document.getElementById('fetch-btn');
const loadingDiv = document.getElementById('loading');
const errorDiv = document.getElementById('error');
const resultsSection = document.getElementById('results-section');
const linksContainer = document.getElementById('links-container');
const linkCountSpan = document.getElementById('link-count');
const searchInput = document.getElementById('search-input');
const copyBtn = document.getElementById('copy-btn');
const downloadBtn = document.getElementById('download-btn');

let allLinks = [];
let baseUrl = '';

// Event Listeners
fetchBtn.addEventListener('click', handleFetch);
searchInput.addEventListener('input', filterLinks);
copyBtn.addEventListener('click', copyAllLinks);
downloadBtn.addEventListener('click', downloadLinks);

// Main fetch function
async function handleFetch() {
    const url = urlInput.value.trim();

    if (!url) {
        showError('Please enter a URL');
        return;
    }

    // Validate URL format
    if (!isValidUrl(url)) {
        showError('Please enter a valid URL (e.g., https://example.com)');
        return;
    }

    baseUrl = new URL(url).origin;
    showLoading(true);
    hideError();
    resultsSection.classList.add('hidden');

    try {
        const html = await fetchWebsite(url);
        const links = extractLinks(html, url);
        
        allLinks = links;
        displayLinks(links);
        showLoading(false);
    } catch (error) {
        console.error('Error:', error);
        showError(`Failed to fetch: ${error.message}`);
        showLoading(false);
    }
}

// Fetch website content
async function fetchWebsite(url) {
    try {
        // Try direct fetch first
        const response = await fetch(url);
        if (!response.ok) throw new Error(`HTTP ${response.status}`);
        return await response.text();
    } catch (error) {
        // Fallback to CORS proxy
        const corsUrl = `https://api.allorigins.win/raw?url=${encodeURIComponent(url)}`;
        const response = await fetch(corsUrl);
        if (!response.ok) throw new Error('Failed to fetch with CORS proxy');
        return await response.text();
    }
}

// Extract links from HTML
function extractLinks(html, baseUrl) {
    const doc = new DOMParser().parseFromString(html, 'text/html');
    const links = [];
    const linkType = linkTypeSelect.value;
    const baseUrlObj = new URL(baseUrl);

    // Extract <a> tags (links)
    const anchors = doc.querySelectorAll('a[href]');
    anchors.forEach(anchor => {
        try {
            let href = anchor.getAttribute('href');
            if (!href) return;

            // Skip anchor links and javascript
            if (href.startsWith('#') || href.startsWith('javascript:')) return;

            // Convert relative URLs to absolute
            const absoluteUrl = new URL(href, baseUrl).href;
            const isInternal = new URL(absoluteUrl).origin === baseUrlObj.origin;

            // Filter based on selection
            if (linkType === 'internal' && !isInternal) return;
            if (linkType === 'external' && isInternal) return;

            links.push({
                url: absoluteUrl,
                text: anchor.textContent.trim() || absoluteUrl,
                type: 'link',
                isInternal: isInternal
            });
        } catch (e) {
            // Invalid URL, skip
        }
    });

    // Extract images if requested
    if (linkType === 'all' || linkType === 'images') {
        const images = doc.querySelectorAll('img[src]');
        images.forEach(img => {
            try {
                let src = img.getAttribute('src');
                if (!src) return;

                const absoluteUrl = new URL(src, baseUrl).href;
                links.push({
                    url: absoluteUrl,
                    text: img.getAttribute('alt') || 'Image',
                    type: 'image',
                    isInternal: true
                });
            } catch (e) {
                // Invalid URL, skip
            }
        });
    }

    // Remove duplicates
    const uniqueLinks = Array.from(new Map(links.map(l => [l.url, l])).values());
    return uniqueLinks.sort((a, b) => a.url.localeCompare(b.url));
}

// Display links
function displayLinks(links) {
    linksContainer.innerHTML = '';
    linkCountSpan.textContent = `${links.length} links found`;

    links.forEach(link => {
        const linkItem = createLinkItem(link);
        linksContainer.appendChild(linkItem);
    });

    if (links.length > 0) {
        resultsSection.classList.remove('hidden');
    } else {
        showError('No links found on this website');
    }
}

// Create link item element
function createLinkItem(link) {
    const div = document.createElement('div');
    div.className = 'link-item';

    if (link.type === 'image') {
        div.classList.add('image');
    } else if (!link.isInternal) {
        div.classList.add('external');
    } else {
        div.classList.add('internal');
    }

    const icon = link.type === 'image' ? '🖼️' : (link.isInternal ? '🔗' : '🔗');

    div.innerHTML = `
        <div class="link-icon">${icon}</div>
        <div class="link-content">
            <a href="${link.url}" target="_blank" class="link-text" title="${link.url}">
                ${escapeHtml(link.url)}
            </a>
            <div class="link-label">
                ${link.type === 'image' ? 'Image' : (link.isInternal ? 'Internal Link' : 'External Link')}
                ${link.text ? ` • ${escapeHtml(link.text)}` : ''}
            </div>
        </div>
        <div class="link-actions">
            <button class="btn-copy" onclick="copyLink('${escapeHtml(link.url)}', this)">
                Copy
            </button>
        </div>
    `;

    return div;
}

// Filter links based on search
function filterLinks() {
    const searchTerm = searchInput.value.toLowerCase();
    const items = document.querySelectorAll('.link-item');
    let visibleCount = 0;

    items.forEach(item => {
        const linkText = item.querySelector('.link-text').textContent.toLowerCase();
        const matches = linkText.includes(searchTerm);
        item.style.display = matches ? '' : 'none';
        if (matches) visibleCount++;
    });

    linkCountSpan.textContent = `${visibleCount} of ${allLinks.length} links`;
}

// Copy single link
function copyLink(url, button) {
    navigator.clipboard.writeText(url).then(() => {
        const originalText = button.textContent;
        button.textContent = '✓ Copied!';
        button.classList.add('copied');

        setTimeout(() => {
            button.textContent = originalText;
            button.classList.remove('copied');
        }, 2000);
    }).catch(() => {
        alert('Failed to copy: ' + url);
    });
}

// Copy all links
function copyAllLinks() {
    const visibleLinks = Array.from(document.querySelectorAll('.link-item'))
        .filter(item => item.style.display !== 'none')
        .map(item => item.querySelector('.link-text').textContent);

    const text = visibleLinks.join('\n');
    navigator.clipboard.writeText(text).then(() => {
        copyBtn.textContent = '✓ Copied!';
        copyBtn.classList.add('copied');

        setTimeout(() => {
            copyBtn.textContent = 'Copy All';
            copyBtn.classList.remove('copied');
        }, 2000);
    }).catch(() => {
        alert('Failed to copy links');
    });
}

// Download links
function downloadLinks() {
    const visibleLinks = Array.from(document.querySelectorAll('.link-item'))
        .filter(item => item.style.display !== 'none')
        .map(item => item.querySelector('.link-text').textContent);

    const content = `Website: ${baseUrl}\nDate: ${new Date().toLocaleString()}\nTotal Links: ${visibleLinks.length}\n\n${visibleLinks.join('\n')}`;

    const blob = new Blob([content], { type: 'text/plain' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = `links_${new Date().getTime()}.txt`;
    document.body.appendChild(a);
    a.click();
    document.body.removeChild(a);
    URL.revokeObjectURL(url);
}

// Helper functions
function isValidUrl(string) {
    try {
        new URL(string);
        return true;
    } catch (_) {
        return false;
    }
}

function escapeHtml(text) {
    const map = {
        '&': '&amp;',
        '<': '&lt;',
        '>': '&gt;',
        '"': '&quot;',
        "'": '&#039;'
    };
    return text.replace(/[&<>"']/g, m => map[m]);
}

function showLoading(show) {
    loadingDiv.classList.toggle('hidden', !show);
}

function showError(message) {
    errorDiv.textContent = message;
    errorDiv.classList.remove('hidden');
}

function hideError() {
    errorDiv.classList.add('hidden');
}

// Initialize
console.log('Website Link Fetcher loaded successfully!');
