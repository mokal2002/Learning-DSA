package Arrays;

public class ArrayProblems {

    // Avg os Sum O(n) -> Time Complecity , O(1) -> Space Complaxitiy

    public static double getAvg(int[] arr) {
        double sum = 0; // -> O(1)
        for (int i : arr) {
            sum += i; // -> O(n)
        }
        double size = arr.length; // -> O(1)
        double avg = sum / size; // -> O(1)
        return avg;
    }

    // Multiple each element in array by 10

    public static int[] multiplybyN(int[] arr) {
        int size = arr.length; // -> O(1)
        int newArray[] = new int[size]; // -> O(n)

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElemrnt = element * 10; // -> O(n)
            newArray[i] = newElemrnt;
        }
        return newArray; // -> O(1)
    }

    // Search element n array by linersearch
    public static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // find maximum value in array
    public static int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // if(arr[i] > max){
            // max = arr[i]; // -> O(n)
            // }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // Return Sum of Positive and negative Numbers

    public static int[] getSumOfPosNNeg(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0; // O(1)

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                positiveSum += arr[i];
                // O(n)
            } else {
                negativeSum += arr[i];
            }
        }
        int[] sum = { positiveSum, negativeSum };
        return sum;
    }

    public static int[] findEvenNOddInArr(int[] arr) {
        int OddNums = 0;
        int EvenNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                EvenNums++;
            } else {
                OddNums++;
            }
        }
        int[] ans = { OddNums, EvenNums };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 9 };

        int[] ans = findEvenNOddInArr(arr);
        for (int i : ans) {
            System.out.println(i);
        }

        // System.out.println(getSumOfPosNNeg(arr));
        // int[] ans = getSumOfPosNNeg(arr);
        // for (int array : ans) {
        // System.out.println(array); //O(n)
        // }

        // System.out.println(findMaxInArray(arr));

        // int arr[] = {2,3,4,5};
        // System.out.println(findTarget(arr, 5));

        // int arr[] = {2,3,4,5};
        // int[] ans=multiplybyN(arr);
        // System.out.println("Printing Array");
        // for (int i : ans) {
        // System.out.print(i+ " "); //
        // }
        // System.out.println();

        // int arr[] = {2,3,4,5};
        // System.out.println(getAvg(arr));

    }
}
