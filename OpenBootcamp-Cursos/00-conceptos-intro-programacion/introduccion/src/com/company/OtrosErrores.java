package com.company;

public class OtrosErrores {
    public static void main(String[] args) {
        //Perdida de precisión
        double temperatura = 15.9;
        int temperaturaInt = (int)temperatura;
        imprime(temperaturaInt);

        double euros = 15.900;
        int eurosInt = (int)temperatura;
        imprime(eurosInt);

        //Out of bound
        int[] array = new int[5];
//        System.out.println(array[5]);

        //Overflow
        byte numeroByte = 127;
        System.out.println(numeroByte);

        numeroByte += 5;
        System.out.println(numeroByte);
    }

    public static void imprime(double parametro) {
        System.out.println("Perdida de precisión: " + parametro);
    }
}
