package org.example.MathsProblems;

public class PrintDigit {

    // static int revNumber(int num){
    //     int revNum= 0;
    //      int sum=0;
    //     while (num != 0) {
    //         int digit = num % 10;
    //         sum=sum+digit;
    //         num = num / 10;
    //     }
    //     return sum;
    // }


    static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum=sum+digit;
            num = num / 10;
        }
        return sum;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    static void printDigits(int num) {

        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;

        }
    }

    public static void main(String[] args) {
        int num = 123456;
        // printDigits(num);

        // System.out.println(countDigits(num));

        System.out.println(sumDigits(num));

    }
}
