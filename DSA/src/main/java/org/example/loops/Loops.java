package org.example.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Print counting from 1 to n : ");
        // System.out.println();
        //
        // int n = sc.nextInt();
        // System.out.println();
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Count : "+ i);
        // }

        // System.out.println("Print counting from n to 1 : ");
        // System.out.println();
        //
        // int n = sc.nextInt();
        //
        // for (int i = n; i >= 1; i--) {
        // System.out.println("Count : "+ i);
        // }

        // System.out.println("Print first 10 multiples of n:");
        // int n = sc.nextInt();
        //
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n * i);
        // }

        // System.out.println("Print Your name 100 times.");
        // String name = sc.nextLine();
        //
        // for (int i = 1; i <= 100 ; i++) {
        // System.out.println(i + " = " + name);
        // }

        // System.out.println("Prime numbers from 1 to 100:");

        // for (int i = 2; i <= 100; i++) {
        // int count = 0;
        //
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // count++;
        // }
        // }
        //
        // if (count == 2) {
        // System.out.println(i);
        // }
        // }

        // System.out.println("Print all even number from 1 to 100");
        //
        //// for (int i = 2; i <= 100 ; i=i+2) {
        //// System.out.println(i);
        //// }
        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // System.out.println("print the sum of all the numbers from 1 to n.");
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= n ; i++) {
        // count =count+i;
        // }
        // System.out.println(count);
        // int n = sc.nextInt();
        // int sum = n * (n + 1) / 2;
        // System.out.println(sum);

        System.out.println("print all integers from 50 to 100 that are perfectly divisible by 7");
        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
        

    }
}
