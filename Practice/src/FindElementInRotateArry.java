public class FindElementInRotateArry {

    public static int pivotIndex(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (nums[s] <= nums[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static int binarySearch(int[] nums, int s, int e, int target) {
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] <= target) {
                s = mid + 1;

            } else {
                ans = mid;
                e = mid - 1;

            }
        }
        return -1;
    }

    public static int searchPivotIndiexInRotateArray(int[] nums, int target) {

        int pivotIndex = pivotIndex(nums);
        int n = nums.length;

        if (pivotIndex == -1) {
            int ans = binarySearch(nums, 0, n - 1, target);
            return ans;
        } else {
            int sArray1 = 0;
            int eArray1 = pivotIndex;

            if (target >= nums[sArray1] && target <= nums[eArray1]) {
                int ans = binarySearch(nums, sArray1, eArray1, target);
                return ans;
            }

            int sArray2 = pivotIndex + 1;
            int eArray2 = n - 1;

            if (target >= nums[sArray2] && target <= nums[eArray2]) {
                int ans = binarySearch(nums, sArray2, eArray2, target);
                return ans;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 50, 60, 70, 10, 20, 30, 40 };

        System.out.println(searchPivotIndiexInRotateArray(arr, 60));

    }
}
