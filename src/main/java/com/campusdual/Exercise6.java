package com.campusdual;

public class Exercise6 {
    //MUESTRA LOS PRIMEROS 15 NUMEROS NATURALES
    //SUMA LOS PRIMEROS 100 NÚMEROS NATURALES
    public static void main(String[] args) {
        for (int i = 0; i<=14; i++){
            System.out.println(i+1);
        }
        int count = 0;
        for (int i = 0; i<=100; i++){
            count = count+i;
        }
        System.out.println(count);
    }
}
