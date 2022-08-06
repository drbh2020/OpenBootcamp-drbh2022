package com.tipos;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("12345678H", "Nombre Apellido 1");
        personas.put("12345678L", "Nombre Apellido 2");
        personas.put("12345678P", "Nombre Apellido 3");

        System.out.println(personas);

        //Iterar las claves con .keySet()
        for (String key:personas.keySet()) {
            System.out.println(key);
        }

        //Iterar los valores con .values()
        for (String value:personas.values()) {
            System.out.println(value);
        }

        //Iterar las claves y valores con .Entry<k,v> y .entrySet()
        for (Map.Entry<String, String> pair :
                personas.entrySet()) {
            System.out.println(pair.getKey() + "/" + pair.getValue());
        }

    }
}
