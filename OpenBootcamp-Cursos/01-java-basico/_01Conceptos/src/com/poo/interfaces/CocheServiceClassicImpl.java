package com.poo.interfaces;

import com.poo.Coche;
import com.poo.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clásico");
    }
}
