package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDSA {

    //Remove Duplicates from Sorted Array
    public static int RemoveDuplicatedFromSortedArrays(int[] nums){
        int i = 0;
        int j =1;
        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;                
            }

            else {
                i++;
                nums[i] = nums[j];
                j++;
            }
            
        }
        return i+j;
    }

    //3Sum
    public static List<List<Integer>> ThreeSum(int[] nums){
        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                        
                    }
                }
            }
            
        }
        return new ArrayList<>(result);
    }





    //TWo Sum Problem
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }


    public static void main(String[] args) {


        //Duplicated Remove
        int[] nums = {1,2,3,4,4,5};
        System.out.println(RemoveDuplicatedFromSortedArrays(nums));
        // //3Sum
        // int[] nums = {-1,0,1,2,-1,-4};
        // System.out.println(ThreeSum(nums));

        // //TWO SUM PROBLEM
        // int[] arr = { 2, 7, 11, 15 };
        // int target = 18;
        // int[] result = twoSum(arr, target);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);
        
    }
    
}
