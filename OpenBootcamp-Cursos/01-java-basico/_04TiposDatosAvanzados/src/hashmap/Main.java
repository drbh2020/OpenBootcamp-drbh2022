package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);


        int valorMapa = mapa.get("clave1");
        mapa.put("clave4", 90);
        mapa.replace("clave4", 120);
        mapa.remove("clave4");

        for (Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

    }
}
