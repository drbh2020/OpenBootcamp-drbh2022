package com.company;

public class Depurador {


    public static void main(String[] args) {

        //Break Point
        int suma = 0;
        suma = suma + 16;

//        System.out.println(suma);

        //Watcher Point (condiciones)
        int[] valores = new int[5];
        int posicion = 5;
//        System.out.println(valores[posicion]);

        //Pila de llamadas (registro de invocaciones)
        funcion1();
    }
    public static void funcion1() {
        funcion2();
    }

    public static void funcion2() {
        funcion3();
    }

    public static void funcion3() {
        funcion4();
    }

    public static void funcion4() {
        System.out.println("vaya viaje nos estamos dando");
        var i = 15;
        System.out.println(i / 0);
    }
}
