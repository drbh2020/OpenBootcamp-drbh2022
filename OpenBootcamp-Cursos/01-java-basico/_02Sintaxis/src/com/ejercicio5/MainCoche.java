package com.ejercicio5;

public class MainCoche {

    public static void main(String[] args) {
        CocheCRUD coche = new CocheCrudImpl();

        coche.save();
        coche.findAll();
        coche.delete();
    }
}
