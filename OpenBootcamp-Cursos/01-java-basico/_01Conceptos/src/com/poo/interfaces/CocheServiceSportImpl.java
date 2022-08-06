package com.poo.interfaces;

import com.poo.Coche;
import com.poo.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche de carreras");
    }
}
