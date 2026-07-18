package sortingalgos;

public class SortingAlgo {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("Round " + i);
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currValue = arr[i];
            while (prev >= 0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = currValue;

        }

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 6, 5, 4, 2 };
        // bubbleSort(arr);
        // System.out.println("Printing the Sorted Array.");
        // for (int value : arr) {
        // System.out.print(value + " ");
        // }
        // System.out.println();

        int arr[] = { 3, 1, 5, 4, 2 };
        insertionSort(arr);
        System.out.println("Printing the Sorted Array.");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}