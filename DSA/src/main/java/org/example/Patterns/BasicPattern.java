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




        
    }
}