package Arrays;

public class ArrayNextLevl {

<<<<<<< HEAD
    public static int findMissingNumber(int[] nums) {
=======
    public static int findUniqueElement(int[] nums){
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static int findMissingNumber(int[] nums){
>>>>>>> c80e5745dc0e2ca364813879e4af9f2c1d304471
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

        int n = nums.length;
<<<<<<< HEAD

        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }
=======
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }   
>>>>>>> c80e5745dc0e2ca364813879e4af9f2c1d304471
        return xorSum;
    }

    public static int[] get0sand1s(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println("Array imp questions.");
        int[] nums = {1,2,4,5,6};

<<<<<<< HEAD
        System.out.println(findMissingNumber(nums));
        // Missing Number

        // int nums[] = { 0, 0, 1, 1, 0, 1, 0, 0, 1 };
=======
        // Find the Unique Element in Array

        int nums[] = {1,2,3,4,1,2,3};
        System.out.println(findUniqueElement(nums));





        // //Missing Number

        // int nums[] = {0,1,3,4};
        // System.out.println(findMissingNumber(nums));

        // int nums[] = {0,0,1,1,0,1,0,0,1};
>>>>>>> c80e5745dc0e2ca364813879e4af9f2c1d304471
        // int num[] = get0sand1s(nums);
        // for (int i : num) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

    }
}
