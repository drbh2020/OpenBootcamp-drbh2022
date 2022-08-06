package com.ejecicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Enteros
        byte variable1 = 5; // 1 byte
        short variable2 = 10; // 2 byte
        int variable3 = 30; // 4 byte
        long variable4 = 100; // 8 byte


        System.out.println("Numeros enteros: " + variable1 + " , " + variable2 + " , " + variable3 + " , " + variable4);


        //Decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        System.out.println("Decimales: " + variable5 + " , " + variable6);

        //Booleanos
        boolean variable7 = true;
        boolean variable8 = false;
        System.out.println("Booleano: " + variable7 + " o " + variable8);

        //Caracter
        char variable9 = 'a';
        System.out.println("Caracter: " + variable9);

        //Cadena de Texto
        String variable10 = "Lorem ipsum dolor sit amet...........";
        System.out.println("Cadena de texto: " + variable10);
    }
}
