package org.example.Strings;

public class StringBasics {
    static int countVowels(String str){
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "hello world";
        countVowels(str);

        // //Print Each Char of String.
        // char[] arr= str.toCharArray();
        // for(int i=0;i<=arr.length;i++){
        // System.out.println(arr[i]);
        // }

        // //count len of string without lenth method
        // char[] arr= str.toCharArray();
        // int count=0;
        // for(int i=0;i < arr.length;i++){
        // count++;
        // }
        // System.out.println("length of a String: "+ count);

        // String strr= new String("hello world");

        // System.out.println(str==strr);
        // System.out.println(str.equals(strr));
        // System.out.println(str.equalsIgnoreCase(strr));

    }
}
