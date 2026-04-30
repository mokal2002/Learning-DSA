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

    // retirn 0 count and 1 counts
    public static int[] getCountof0n1(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        int ans[] = { zeroCount, oneCount };
        return ans;

    }

    // find unsorted array

    public static int findUnsortedElementInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];

            }
        }
        return -1;
    }

    // swap alternative elements in aaray
    public static int[] swapElementsInArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i += 2) {
            int swap = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = swap;
        }

        return arr;
    }

    // Print Array Intersection element

    public static int[] findWhereInterractionInArray(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    // avoid duplicates in result
                    boolean alreadyAdded = false;
                    for (int x = 0; x < k; x++) {
                        if (temp[x] == arr1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }

                    if (!alreadyAdded) {
                        temp[k] = arr1[i];
                        k++;
                    }

                    break; // move to next arr1 element
                }
            }
        }
        // final result array (exact size)
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Print Alternativeof Extream Array
    public static int[] getExtremeAlternativeArray(int[] arr) {

        int[] result = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        int k = 0;

        while (left <= right) {

            if (left == right) {
                result[k++] = arr[left];
            } else {
                result[k++] = arr[left];
                result[k++] = arr[right];
            }

            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] ans = getExtremAlternativeArray(arr);

        // int[] arr1 = { 1, 2, 2, 3, 4 };
        // int[] arr2 = { 2, 2, 4, 6 };
        // int[] ans = findWhereInterractionInArray(arr1, arr2);
        // System.out.println(ans);
        // for (int i : ans) {
        // System.out.print(i+ " ");
        // }
        // System.out.println();

        // int arr[] = { 3, 4, 5, 9, 6, 9 };
        // int[] ans = swapElementsInArray(arr);
        // System.out.println(arr);
        // for (int i : ans) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        // int ans = findUnsortedElementInArray(arr);
        // System.out.println(ans);

        // int arr[] = {1,1,0,0,1,0,0,1};

        // int[] ans = getCountof0n1(arr);
        // System.out.println(ans[0]);
        // System.out.println(ans[1]);

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
