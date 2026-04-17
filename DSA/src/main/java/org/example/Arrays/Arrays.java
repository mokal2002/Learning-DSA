package org.example.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays.");

        // int arr[]; // init arr

        // arr = new int[5]; //decered arr

        // int brr[] = {10,20,30,40,50};
        // System.out.println(arr.toString()); // Printing arr
        // System.out.println(brr[0]); //getting value of index 0.

        // for(int i=0;i<brr.length;i++){
        // System.out.println(brr[i]);
        // }

        // for (int i : brr) {
        // System.out.println(i);
        // }

        // //getting dynamic value form user using scanner
        // int array[] = new int[5];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < array.length; i++) {
        // array[i] = sc.nextInt();
        // }
        // System.out.println();

        // for(int arr: array){
        // System.out.print(arr + " ");
        // }
        // System.out.println();
        // sc.close();

        // //sum of an array
        // int arr1[]= {23,43,54,67,234};
        // int sum=0;
        // for(int i =0;i<arr1.length;i++){
        // int value = arr1[i];
        // sum = sum + value;
        // }
        // System.out.println(sum);

        // //multiplication of an array

        // int arr2[]= {2,3,10,20};
        // int ans =1;

        // for(int i=0;i<arr2.length;i++){
        // int value = arr2[i];
        // ans = ans * value;
        // }
        // System.out.println(ans);

        // find max number in aaray
        // int maxarr[] = { 2, 4, 1, 6, -4, 45, 34 };

        // int max = maxarr[0];

        // for (int i = 0; i < maxarr.length; i++) {
        // if (maxarr[i] > max) {
        // max = maxarr[i];
        // }
        // }
        // System.out.println(max);

        // find min value in aaray

        // int arrr[] = { 2, 4, 1, -6, 3, 4 };

        // int minvalue = arrr[0];

        // for (int i = 0; i < arrr.length; i++) {
        // if (arrr[i] < minvalue) {
        // minvalue = arrr[i];
        // }
        // }
        // System.out.println(minvalue);

        // 2D Array

        // int[][] arr;
        // arr = new int[2][3];

        // int[][] brr= {{2,3},{3,4},{4,5}};

        // // System.out.println(brr[0][0]);

        // for(int i=0;i<brr.length;i++){
        // for(int j =0;j<brr[0].length;j++){
        // System.out.print(brr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int[][] brr= {{2,3},{3,4,3,6},{4,5,3}};

        // for(int i=0;i<brr.length;i++){
        // for(int j =0;j<brr[i].length;j++){
        // System.out.print(brr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // // challange
        // Scanner sc = new Scanner(System.in);
        // int[][] userarr = new int[2][3];
        // for (int i = 0; i < userarr.length; i++) {
        // for (int j = 0; j < userarr[i].length; j++) {
        // userarr[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < userarr.length; i++) {
        // for (int j = 0; j < userarr[i].length; j++) {
        // System.out.print(userarr[i][j] + " ");
        // }
        // System.out.println();
        // }
        // sc.close();

        // // sum of 2D Arrary

        // int[][] ari= {{2,3,4},{5,6,7},{8,9,0}};
        // int ans=0;
        // for (int i = 0; i < ari.length; i++) {
        // for (int j = 0; j < ari[i].length; j++) {
        // int value = ari[i][j];
        // ans = ans +value;

        // }
        // }
        // System.out.println(ans);

        // int[][] ari = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 0 } };
        // int ans = 1;
        // for (int i = 0; i < ari.length; i++) {
        // for (int j = 0; j < ari[i].length; j++) {
        // int value = ari[i][j];
        // ans = ans * value;

        // }
        // }
        // System.out.println(ans);

        int[][] arr = { { 2, 5, 3 }, { 56, 5, 7 } };

        // int maxvalue = arr[0][0];

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] > maxvalue) {
        // maxvalue = arr[i][j];
        // }
        // }
        // }
        // System.out.println(maxvalue);

        // int minvalue = arr[0][0];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (arr[i][j] < minvalue) {
        //             minvalue = arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(minvalue);

    }
}
