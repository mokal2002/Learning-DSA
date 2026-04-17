package org.example.Methods;

class PrintTable{
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    
    static void add(int a,int b){
        System.out.println(a+b);
    }
    //Mrthos Overloading Signature or parmameter should be diffrent or only return type is not comple
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        // table(2);
        add(2,4);
        add(8, 5, 9);
    }

    
}