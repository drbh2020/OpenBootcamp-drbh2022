package com.poo;

public class PolimorfismoMain {
    public static void main(String[] args) {

        //Sin Polimorfismo
//        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //Con Polimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche) { //true
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico) { //true
            System.out.println("Coche Electrico");
        }

        if (coche4 instanceof CocheHibrido) { //false
            System.out.println("Coche Híbrido");
        }
    }
}
