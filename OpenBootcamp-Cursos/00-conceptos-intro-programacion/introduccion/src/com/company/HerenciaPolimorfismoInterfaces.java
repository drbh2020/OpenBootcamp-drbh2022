package com.company;

public class HerenciaPolimorfismoInterfaces {
    public static void main(String[] args) {
    //Herencia
    /*
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 14;
        cocheElectrico.matricula = "ABC 1234 ES";

        System.out.println(cocheElectrico.compruebaMatricula("XAXX"));
    */
    // Abstract
    /*
        Coche1 coche1 = new Coche1();
        coche1.setSonido("BRR");
        System.out.println(coche1.getSonido());
    */
    // Herencia múltiple (aquí no se hizo nada)

    // Polimorfismo
    /*  Coche1 coche = new Coche1();

        coche.diHola();
        coche.sumaNumeros(3,5);
        coche.sumaNumeros((float) 15,(float) 20);
        coche.sumaNumeros(2.3,3.5);
        coche.sumaNumeros(2.3, (int)5); // Da Error
    */
    //Interfaces

    }

}

//Herencia

/*
class Vehiculo1 {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }
}

final class Coche1 extends Vehiculo1 {
}

class CocheElectrico extends Coche1{
}
*/

//Abstract

/*
abstract class Vehiculo1 {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo1() {
        System.out.println("Estoy en el constructor de Vehiculo1");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

}

class Coche1 extends Vehiculo1 {

    @Override
    public String getSonido() {
        return "Soy un super sonido: " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class Moto1 extends Vehiculo1 {

    @Override
    public String getSonido() {
        return "Soy un sonidillo de moto: " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
*/

// Herencia múltiple

/*
class Vehiculo1 {
    int velocidadMaxima;

    public Vehiculo1() {
        System.out.println("Estoy en el constructor de Vehiculo1");
    }

}

class Motor1 {
    String tipomotor;

    public Motor1(){
        System.out.println("Estoy en el constructor Motor");
    }
}

class Coche1 extends Vehiculo1, Motor1 {
    public Coche1() {

    }
}*/

// Polimorfismo

/*
class Vehiculo1 {
    public void diHola() {
        System.out.println("Hola!!");
    }

}

class Coche1 extends Vehiculo1{
    public void diHola() {
        System.out.println("Soy un coche");
    }
    // Funciones polimórfincas
    public int sumaNumeros(int a, int b) {
        System.out.println("Soy el sumaNumeros de INT");
        return a + b;
    }


    public float sumaNumeros(float a, float b){
        System.out.println("Soy el sumaNumeros de FLOAT");
        return a + b * (float)9.0;
    }

    public void sumaNumeros(double param1, double param2){
        System.out.println("Soy el sumaNumeros de DOUBLE");
        System.out.println("El resultado es: " + (param1 + param2));
    }

}*/

// Interfaces

interface  Vehicle1 {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche1 implements Vehicle1{

    public void Acelerar(int cuantaVelocidad) {

    }

    public void Frenar(int cuantaVelocidad) {

    }
}

