package com.company;

public class MetodosDeClase {
    public static void main(String[] args) {

        //Métodos de CLase

/*        Coche2 coche = new Coche2();
        coche.Acelerar(50);

        var resultado = suma(2,5);
        System.out.println(resultado);*/

        //Usar una interfaz

        /*Coche3 coche3 = new Coche3();
        Moto3 moto3 = new Moto3();
        EjecutaAcelerar(coche3);
        EjecutaAcelerar(moto3);*/

        // Parámetros por valor

/*        int valA = 5; // int = 32 bits = 4 bytes
        int valB = 10; // int = 32 bits = 4 bytes

        suma(valA, valB);

        System.out.println(valA);
        System.out.println(valB);*/

        //Parámetros por referencia
        Coche3 coche = new Coche3();
        cocheChanger(coche);

        System.out.println(coche.velocidad);

        factorial(8);
        suma(10, 20);
    }
    //Métodos de CLase
    /*
    public static int suma(int operandoA, int operandoB) {
        return operandoA + operandoB;
    }*/

    //Usar una interfaz

    /*public static void EjecutaAcelerar(Vehicle2 vehiculo2){
        vehiculo2.Acelerar(15);
    }*/

    // Parámetros por valor

/*    public static int suma(int a, int b) {
        return a + b;
    }*/

    // Parámetros por referencia

    public static void cocheChanger(Coche3 coche3) {
        coche3.velocidad += 50;
    }


    // Recursividad
    public static int factorial(int numero) {
        int resultado;
        if(numero == 1) {
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    public static int factorialNR(int numero) {
        int temp;
        int resultado = 1;

        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }
        return resultado;
    }

    public static void suma(int a, int b) {
        var temp = a + b;
        System.out.println("A vale " + a + " B vale " + b + " temp vale " + temp );
        if (b >= 90) {
            return;
        }
        suma(a, temp);
    }



}

interface  Vehicle2 {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche3 implements Vehicle2{
    int velocidad = 0;

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche2() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche2() -> Frenar()");
    }
}

class Moto3 implements Vehicle2{

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto3() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto3() -> Frenar()");
    }
}