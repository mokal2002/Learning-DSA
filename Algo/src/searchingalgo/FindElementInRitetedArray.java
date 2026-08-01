package searchingalgo;

public class FindElementInRitetedArray {

    public static int findPivotIndexInRoatateArray(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (arr[s] <= arr[e]) {
            return -1;
        }

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }

        }
        return ans;
    }

    public static int searchBinary(int[] arr, int s, int e, int target) {

        int n = arr.length;
        // int mid = (s + e) / 2;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public static int search(int arr[], int target) {

        int pivotIndex = findPivotIndexInRoatateArray(arr);
        int n = arr.length;

        if (pivotIndex == -1) {
            int ans = searchBinary(arr, 0, n - 1, target);
            return ans;
        } else {
            int sArray1 = 0;
            int eArray1 = pivotIndex;

            if (target >= arr[sArray1] && target <= arr[eArray1]) {
                int ans = searchBinary(arr, sArray1, eArray1, target);
                return ans;
            }

            int sArray2 = pivotIndex + 1;
            int eArray2 = n - 1;

            if (target >= arr[sArray2] && target <= arr[eArray2]) {
                int ans = searchBinary(arr, sArray2, eArray2, target);
                return ans;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={50,60,70,10,20,30,40};
        System.out.println(search(arr, 60));
    }
}
