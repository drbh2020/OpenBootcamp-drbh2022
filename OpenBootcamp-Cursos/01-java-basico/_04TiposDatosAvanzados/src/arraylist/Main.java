package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Diferencia entre Vector y ArrayList (Concurrencia)
        //CapacidadVector = CapacidadVector * 2;
        //CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<String>();

        //Métodos
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");

        //Iteración
        /*
        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        */

        //Convertir ArrayList en un Array
        String[] array = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (Object arrayObject :lista.toArray()) {
            System.out.println(arrayObject.toString());
        }

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

    }
}
