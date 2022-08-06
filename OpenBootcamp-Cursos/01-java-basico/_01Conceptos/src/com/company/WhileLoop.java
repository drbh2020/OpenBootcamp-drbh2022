package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while(count < 10) {
            count++; //Condición

            if(count == 6)
                break; // rompe el flujo de ejecución
                // continue; //Salta el valor 6 y continua  a la siguiente iteración

            System.out.println("Hola Mundo " + count);


        }

        System.out.println("Fin");
    }
}
