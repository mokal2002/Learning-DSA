package sortingalgos;

public class SortingAlgo {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i< n-1;i++){
            for(int j = 0; j < n-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,5,4,2};
        bubbleSort(arr);
        System.out.println("Printing the Sorted Array.");
        for (int value : arr) {
            System.out.println(value + " ");
        }
    

    }
}