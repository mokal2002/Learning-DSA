package twodarray;

import java.util.ArrayList;
import java.util.List;

public class WavePrintAMatrix {

    public static List<Integer> wavePrintMatrix(int[][] arr) {

        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0; col < n; col++) {
            if ((col & 1) == 1) {
                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }

            } else {
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int arr[][] = { { 10, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };

        System.out.println(wavePrintMatrix(arr));
    }
}
