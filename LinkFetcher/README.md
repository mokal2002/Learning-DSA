# 🔗 Website Link Fetcher

A simple and elegant web application to fetch and extract all links from any website.

## Features

✨ **Easy to Use** - Simply enter a URL and click "Fetch Links"

🔍 **Smart Filtering**
- All Links - Fetch all links and images
- Internal Links Only - Links within the same domain
- External Links Only - Links to other domains
- Images Only - Extract all image URLs

🛠️ **Useful Tools**
- Search/filter links in real-time
- Copy individual links with one click
- Copy all links at once
- Download links as a text file
- Direct link opening in new tab

📱 **Responsive Design** - Works on desktop, tablet, and mobile devices

🌐 **CORS Support** - Uses fallback proxy for websites with CORS restrictions

## How to Use

1. **Open the App**
   - Open `index.html` in any modern web browser

2. **Enter Website URL**
   - Type or paste a website URL (e.g., `https://example.com`)

3. **Select Filter Type**
   - Choose what type of links you want to fetch:
     - All Links
     - Internal Links Only
     - External Links Only
     - Images Only

4. **Click "Fetch Links"**
   - The app will fetch the website and extract all matching links

5. **Interact with Results**
   - Search through results using the search box
   - Click any link to open it
   - Use "Copy" button to copy individual links
   - Use "Copy All" to copy all visible links
   - Use "Download" to save links as a text file

## Technical Details

### Technologies Used
- **HTML5** - Semantic markup
- **CSS3** - Modern styling with gradients and animations
- **JavaScript (ES6+)** - Fetch API, DOM manipulation

### How It Works

1. **URL Validation** - Checks if the entered URL is valid
2. **Website Fetching** - Downloads the website HTML (with CORS proxy fallback)
3. **Link Extraction** - Parses HTML to find all `<a>` tags and `<img>` tags
4. **URL Normalization** - Converts relative URLs to absolute URLs
5. **Filtering** - Categorizes links as internal or external
6. **Deduplication** - Removes duplicate links
7. **Display** - Shows results with filters and search functionality

### CORS Note

This app uses the **AllOrigins** CORS proxy as a fallback. If the direct fetch fails, it automatically tries:
- Primary: Direct fetch (works for many sites)
- Fallback: `https://api.allorigins.win/raw?url=...`

If both fail, you'll see an error message.

## File Structure

```
LinkFetcher/
├── index.html    # Main HTML page
├── style.css     # Styling
├── script.js     # Functionality
└── README.md     # This file
```

## Browser Compatibility

✅ Chrome/Chromium (latest)
✅ Firefox (latest)
✅ Safari (latest)
✅ Edge (latest)
✅ Mobile browsers

## Examples

### Example 1: Extract all links from a news website
1. Enter: `https://news.ycombinator.com`
2. Select: "All Links"
3. Click: "Fetch Links"
4. Result: See all articles, comments, and external links

### Example 2: Find all images on a website
1. Enter: `https://unsplash.com`
2. Select: "Images Only"
3. Click: "Fetch Links"
4. Result: All image URLs from the website

### Example 3: Find internal pages only
1. Enter: `https://example.com`
2. Select: "Internal Links Only"
3. Click: "Fetch Links"
4. Result: All pages within the same domain

## Limitations

⚠️ **What this app cannot do:**
- Fetch JavaScript-generated content (SPA frameworks)
- Access protected or authenticated pages
- Bypass website blockers or paywalls
- Extract links from PDF files or other file types

## Tips & Tricks

💡 Use the search box to quickly find links containing specific keywords
💡 Copy all links and paste them into a text editor for further processing
💡 Check external links to find resources and references
💡 Extract images for batch downloading (with external tools)

## License

Free to use for personal and educational purposes.

## Support

If you encounter any issues:
1. Make sure the URL is valid (starts with http:// or https://)
2. Try a different website to confirm the app works
3. Check browser console (F12) for error messages
4. Clear browser cache and reload the page

---

Made with ❤️ for web enthusiasts and data collectors!
