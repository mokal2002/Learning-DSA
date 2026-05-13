package Arrays;

public class ArrayNextLevl {

    public static int findMissingNumber(int[] nums){
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        return null;
    }

    public static int[] get0sand1s(int[] nums){
        int n = nums.length;
        int i = 0;
        int j = n -1;

        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j]== 1) {
                j--;
            }
            
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println("Array imp questions.");

//Missing Number

        

        // int nums[] = {0,0,1,1,0,1,0,0,1};
        // int num[] = get0sand1s(nums);
        // for (int i : num) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        
    }
}
