package searchingalgo;

public class AllocateMiniPages {
    static boolean isValidAnswer(int[] arr, int k, int maxpages) {
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxpages) {
                pages += arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > maxpages) {
                    return false;
                } else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }

    public static int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }
        int n = arr.length;
        int s = 1;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum;

        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(findPages(arr, 2));
    }
}
