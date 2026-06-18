package twodarray;

import java.util.Arrays;

public class TransponseMatrix {

    public static int[][] transponseMatrix(int arr[][]) {

        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int ans[][] = new int[newTotalRows][newTotalCols];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 4, 3, 5 }, { 3, 4, 5, 3 }, { 3, 5, 4, 7 } };

        int ans[][] = transponseMatrix(arr);

        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
    }
}
