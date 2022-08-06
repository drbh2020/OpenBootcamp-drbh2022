package com.tipos;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("honda civic"));
        coches.add(new Coche("alfa romeo"));
        coches.add(new Coche("ford mondeo"));

        System.out.println(coches);

        for (Coche coche: coches) {
            System.out.println(coche);
        }
    }
}
