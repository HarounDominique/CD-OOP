package com.campusdual;

public class Exercise5 {
    //comprobar si un numero es positivo o negativo
    //comprobnar si un numero es múltiplo de otro
    //comprobar que un número es menor que otro

    public static void positiveOrNegative(int n){
        if(n<0){
            System.out.println(n+" es negativo.");
        }else if(n>0){
            System.out.println(n+ "es positivo.");
        }else{
            System.out.println(n +"???");
        }
    }

    public static void isMultiple(int n){
        int baseNumber = 4;
        if (n%baseNumber ==0){
            System.out.println(n+" es múltiplo de 4.");
        }else{
            System.out.println(n+" no es múltiplo de 4.");
        }
    }

    public static void isHigherOrLower(int n){
        int baseNumber = 9;
        if(n<baseNumber){
            System.out.println(n+" es menor que nueve.");
        }else if(n>baseNumber){
            System.out.println(n+" es mayor que nueve.");
        }else{
            System.out.println(n+" es igual a nueve.");
        }
    }
    public static void main(String[] args) {

    }
}
