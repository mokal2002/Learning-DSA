package twodarray;

public class RotateImage {

    public static int[][] rotateIamageto90Deg(int[][] matrix) {
        int N = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int k = 0; k < N; k++) {
            int startCol = 0;
            int endCol = N - 1;

            while (startCol < endCol) {
                int temp = matrix[k][startCol];
                matrix[k][startCol] = matrix[k][endCol];
                matrix[k][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        int[][] rotated = rotateIamageto90Deg(arr);

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[0].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}