package searchingalgo;

import java.util.Arrays;

public class AggressiveCows {

    static boolean isValidAnswer(int[] arr, int k, int minDistaence){

        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[lastPosition] >= minDistaence) {
                cowCount++;
                lastPosition = i;
            }
            if (cowCount == k) {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCowsAllocation(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int s = 0;
        int e = arr[n - 1] - arr[0];
        int ans = -1;
        int k = 3;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9 };
        System.out.println(aggressiveCowsAllocation(arr));
    }
}
