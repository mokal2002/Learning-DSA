package searchingalgo;

public class BinarySearch {

    public static int searchBinary(int[] arr, int target) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;
        // int mid = (start + end) / 2;
        int mid = start + (end - start) /2;

        while (start <= end) {

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) /2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                991, 992, 993, 994, 995565, 996, 997, 998, 999, 1000
        };
        int target = 7;
        System.out.println(searchBinary(arr, target));

    }
}
