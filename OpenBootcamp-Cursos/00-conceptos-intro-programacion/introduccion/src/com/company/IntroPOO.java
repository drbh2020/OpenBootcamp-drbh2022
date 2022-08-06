package com.company;

public class IntroPOO {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);


        Coche coche2 = new Coche(2, 90);
//        System.out.println(coche.velocidadActual);
//        coche.acelerar();
//        System.out.println(coche.velocidadActual);
//        coche.decelerar();
//
//        Coche coche2 = new Coche();
//        System.out.println(coche2.velocidadActual);

//        System.out.printf("Puertas: %d\n", coche.numeroDePuertas);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);


    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor ***sin nada***");

    }

    public Coche(int numeroDePuertas, int velocidadMaxima) {
//        numeroDePuertas = 5;
//        velocidadMaxima = 120;
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;

        System.out.println("Estoy en el constructor");
    }




/*
    public void acelerar() {
        velocidadActual += 15;
    }
    public void decelerar() {}
*/
}

