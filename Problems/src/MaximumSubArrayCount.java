public class MaximumSubArrayCount {

    // O(n^2)
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("{ " + nums[i] + " + " + nums[j] + " } ");

                sum = nums[i] + nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println();
        return maxSum;
    }

    public static int maxSubArrayByKadans(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static int maxSubArrayByKadansBYBabber(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        System.out.println("MaximumSubArrayCount : ");

        int[] arr = { 2, 3, 1, -2, -3, 4, -3, 3 };
        System.out.println("Maximub SubArray is : " + maxSubArrayByKadansBYBabber(arr));

    }
}
