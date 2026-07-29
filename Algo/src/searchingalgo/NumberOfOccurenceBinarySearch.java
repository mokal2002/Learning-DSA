package searchingalgo;

public class NumberOfOccurenceBinarySearch {
    public static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return ans;
    }

    public static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 30, 30, 40, 40, 50, 60 }; //Sorted Array Thats Wht Values can Be Count
        int lBound = getLowerBound(arr, 30);
        int uBound = getUpperBound(arr, 30);
        int ans = uBound - lBound;
        System.out.println(ans);
    }
}
