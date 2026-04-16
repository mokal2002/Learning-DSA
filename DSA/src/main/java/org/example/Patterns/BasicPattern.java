package org.example.Patterns;

class BasicPattern {
    public static void main(String[] args) {
        System.out.println("Basic Pattern.");

        // System.out.println("Solid Square Pattern");
        // // * * * *
        // // * * * *
        // // * * * *
        // // * * * *
        // int n = 4;

        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= n; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println("Solid Rec Pattern.");
        // // * * * * *
        // // * * * * *
        // // * * * * *
        // int n = 3;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= 5; col++){
        // System.out.print("* ");
        // }
        // System.out.println();s
        // }

        // // SOLID PATTERN RIGTH ANGLE TRANGLE
        // // *
        // // * *
        // // * * *
        // // * * * *
        // // * * * * *
        // for(int row = 1; row <= 5; row++){
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // SOLID ROMBUS PATTERN
        // // - - - - * * * * *
        // // - - - * * * * *
        // // - - * * * * *
        // // - * * * * *
        // // * * * * *
        // int n =5;
        // for(int row =1; row<=n;row++){
        // for(int col=1; col<=n-row;col++){
        // System.out.print("- ");
        // }
        // for(int col=1;col<=n;col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // LEFT PATTERN
        // // * * * * *
        // // * * * *
        // // * * *
        // // * *
        // // *
        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // SOLID PYRIMID Pattern
        // // - - - - *
        // // - - - * * *
        // // - - * * * * *
        // // - * * * * * * *
        // // * * * * * * * * *
        // int n = 5;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print("- ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }

        // // INVERTED PATTERN

        // int n = 4;
        // // * * * * * * *
        // // - * * * * *
        // // - - * * *
        // // - - - *
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row - 1; col++) {
        // System.out.print("- ");
        // }
        // for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // HOLO RECTANNGLE
        // // * * * * * *
        // // * - - - - *
        // // * - - - - *
        // // * * * * * *
        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= 6; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // } else {
        // if (col == 1 || col == 6) {
        // System.out.print("* ");
        // } else {
        // System.out.print("- ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // // HOLO TRANGLE
        // // *
        // // * *
        // // * - *
        // // * - - *
        // // * * * * *
        // int n = 5;

        // for (int row = 1; row <= n; row++) {
        // if (row == 1 || row == 2 || row == n) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // } else {
        // System.out.print("* ");

        // for (int col = 1; col <= (row - 2); col++) {
        // System.out.print("- ");
        // }
        // System.out.print("* ");

        // }
        // System.out.println();

        // }

        // // Holo TRANGLE
        // // - - - - *
        // // - - - * - *
        // // - - * - - - *
        // // - * - - - - - *
        // // * * * * * * * * *
        // int n = 5;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print("- ");
        // }

        // if (row==1 || row==n) {
        // for(int col=1;col<=2*row-1;col++){
        // System.out.print("* ");
        // }
        // }
        // else{
        // System.out.print("* ");
        // for(int col=1;col<=2*row-3;col++){
        // System.out.print("- ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // // Double Inverted pyramid?

        // // - - - *
        // // - - * * *
        // // - * * * * *
        // // * * * * * * *
        // // - * * * * *
        // // - - * * *
        // // - - - *
        // int n = 4;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print("- ");
        // }
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // }
        // for (int row = 1; row <= n; row++) {
        // if (row==1) {
        // continue;
        // }
        // for (int col = 1; col <= row - 1; col++) {
        // System.out.print("- ");
        // }
        // for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // HOLO DIMOND
        // // - - - *
        // // - - * - *
        // // - * - - - *
        // // * - - - - - *
        // // - * - - - *
        // // - - * - *
        // // - - - *
        // int n = 4;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print("- ");
        // }
        // if (row == 1) {
        // for (int col = 1; col <= 2 * row - 1; col++) {
        // System.out.print("* ");
        // }
        // } else {
        // System.out.print("* ");
        // for (int col = 1; col <= 2 * row - 3; col++) {
        // System.out.print("- ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row =1;row<=(n-1);row++){
        // for(int col=1;col<=row;col++){
        // System.out.print("- ");
        // }
        // if (row==(n-1)) {
        // System.out.print("* ");
        // }
        // else{
        // System.out.print("* ");
        // for(int col=1;col<=2*(n-row)-3;col++){
        // System.out.print("- ");
        // }
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // * - - - - - - *
        // // * * - - - - * *
        // // * * * - - * * *
        // // * * * * * * * *
        // // * * * * * * * *
        // // * * * - - * * *
        // // * * - - - - * *
        // // * - - - - - - *
        // int n = 4;

        // for (int row = 1; row <= n; row++) {
        // // part1
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // // part2
        // for (int col = 1; col <= 2 * (n - row); col++) {
        // System.out.print("- ");
        // }
        // // part3
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }
        // for(int row=1;row<=n;row++){

        // //part4
        // for(int col=1;col<=n-row+1;col++){
        // System.out.print("* ");
        // }
        // // part5
        // for(int col=1;col<=2*(row-1);col++){
        // System.out.print("- ");
        // }
        // // part6
        // for(int col=1;col<=n-row+1;col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Numarical Pattern
        // // 1
        // // 1 2
        // // 1 2 3
        // // 1 2 3 4
        // // 1 2 3 4 5

        // int n =5;
        // for(int row=1;row<=n;row++){
        // for(int col=1;col<=row;col++){
        // System.out.print(col+ " ");
        // }
        // System.out.println();
        // }

        // // 1
        // // 2 3
        // // 4 5 6
        // // 7 8 9 10
        // // 11 12 13 14 15

        // int n = 5;
        // int count = 1;
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print(count + " ");
        // count++;
        // }
        // System.out.println();
        // }

        // // Alpha Numarical Pattern
        // // A
        // // A B
        // // A B C
        // // A B C D
        // // A B C D E

        // int n = 5;

        // for(int row=1;row<=n;row++){
        // for(int col=1;col<=row;col++){
        // int a = col;
        // int b = ('A' - 1);
        // int ans = a+b;
        // char finalAns = (char)ans;
        // System.out.print(finalAns+ " ");
        // }
        // System.out.println();
        // }

        // // E
        // // E D
        // // E D C
        // // E D C B
        // // E D C B A
        // int n = 5;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // int a = n - col;
        // int b = 'A';
        // int ans = a+b;
        // char finalAns = (char)ans;
        // System.out.print(finalAns+ " ");
        // }
        // System.out.println();
        // }

        // homework
        // v
        // ^

        // // Pattern 11

        // // Numarical pyramid patter

        // // - - - 1
        // // - - 1 2 1
        // // - 1 2 3 2 1
        // // 1 2 3 4 3 2 1
        // int n = 4;

        // for(int row=1;row<=n;row++){
        // for(int col=1;col<=n-row;col++){
        // System.out.print("- ");
        // }

        // for(int col=1;col<=row;col++){
        // System.out.print(col+ " ");
        // }
        // int decRowvalue = row-1;
        // for(int col =1; col<=row-1;col++){
        // System.out.print(decRowvalue+ " ");
        // decRowvalue--;
        // }
        // System.out.println();

        // }

        // // - - - 1
        // // - - 2 2 2
        // // - 3 3 3 3 3
        // // 4 4 4 4 4 4 4

        // int n =4;
        // for(int row=1;row<=n;row++){
        // for(int col=1;col<=n-row;col++){
        // System.out.print("- ");
        // }
        // for(int col=1;col<=2*row-1;col++){
        // System.out.print(row+ " ");
        // }
        // System.out.println();
        // }





        // // - - - A 
        // // - - A B A 
        // // - A B C B A 
        // // A B C D C B A
        // int n = 4;

        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n - row; col++) {
        //         System.out.print("- ");
        //     }

        //     for (int col = 1; col <= row; col++) {
        //         int a = col;
        //         int b = 'A' - 1;
        //         int ans = a + b;
        //         char finalAns = (char) ans;
        //         System.out.print(finalAns + " ");
        //     }
        //     char decRowvalue = (char)(row + 'A' - 2);
        //     for (int col = 1; col <= row - 1; col++) {
        //         System.out.print(decRowvalue + " ");
        //         decRowvalue--;
        //     }
        //     System.out.println();
        // }




        
    }
}