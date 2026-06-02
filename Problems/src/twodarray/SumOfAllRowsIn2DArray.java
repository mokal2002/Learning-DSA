package twodarray;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllRowsIn2DArray {

    public static List<Integer> sumOfRowsIn2DArray(int[][] arr) { //O(m*n)
        List<Integer> result = new ArrayList<>(); 
        int m = arr.length;
        int n = arr[0].length;

        // Nested Loop Approch
        for (int row = 0; row < m; row++) {

            int sum = 0;
            for (int col = 0; col < n; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);

        }
        return result;
    }

    public static void main(String[] args) {

        // Sum Of All Rows In 2D Array
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        System.out.println(sumOfRowsIn2DArray(arr));
    }
}
