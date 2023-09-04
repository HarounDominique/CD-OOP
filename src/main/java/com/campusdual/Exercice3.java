package com.campusdual;

public class Exercice3 {
    public static void hello(){
        System.out.println("hello");
    }

    public static int addition(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public static void main(String[] args) {

        hello();

        System.out.println(addition(3,4));

    }
}
