package twodarray;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllColsIn2DArray {

    public static List<Integer> sumOfColsIn2DArray(int[][] arr) {

        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        System.out.println(sumOfColsIn2DArray(arr));

    }
}
