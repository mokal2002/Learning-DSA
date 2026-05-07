package Arrays;

public class ArrayManupulationProblems {

    // Reverse an array. 2 Pointer Technique
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    // shift element by one
    static void shiftBy1(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // shift k element by one

    static void shift2elements(int[] arr){
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Array Manupulation Problems");

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // shiftBy1(arr);
        // reverseArray(arr);

    }
}
