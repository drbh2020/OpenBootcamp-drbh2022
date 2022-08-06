package com.poo;

public class CocheMain {

    public static void main(String[] args) {
        String coche = "";
//        Coche cocheObj = new Coche();
        Coche cocheObj = new CocheHibrido();

//        Coche cocheObj2 = new Coche("rojo","Honda","Civic", 1430.45,5.4);
        Coche cocheObj2 = new CocheElectrico("rojo","Honda","Civic", 1430.45,5.4, "motor");


        cocheObj2.acelerar(50);
        System.out.println(cocheObj2.velocidad);
        cocheObj2.peso = 1350.8;
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","alfa","romeo", 1500d, 4.99, "TXZ");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }
}
