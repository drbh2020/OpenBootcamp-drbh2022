package com.ejecicio789;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // CERO: 
        System.out.println("CERO | Texto en reversa: ");

        var cadena = "Hola Me LlaMO Zi";

        System.out.println(reverse(cadena));


        // UNO:
        System.out.println("UNO | Recorrer Array 1D: ");

        String[] arrayCadena1D = {"Hola", "Como", "Les", "va"};

        for (String cadenaTemp : arrayCadena1D) {
            System.out.print(cadenaTemp + " ");
        }
        System.out.println("");


        // DOS:
        System.out.println("DOS | Recorrer Array 2D (pos,val): ");

        int[][] arrayEntero2D = {
                {1,2,3,4},
                {10,20,30,40}
        };

        for (int i = 0; i < arrayEntero2D.length; i++) {
            System.out.println("Posición de i: " + i);
            for (int j = 0; j < arrayEntero2D[i].length; j++) {
                System.out.println("El valor: " + arrayEntero2D[i][j] + " está en i = " + i + ", j = " + j);
            }
        }


        //TRES:
        System.out.println("TRES | Agregar y eliminar, Vector: ");

        Vector<Integer> vector = new Vector<>(5);

        vector.add(5);
        vector.add(0);
        vector.add(45);
        vector.add(779);
        vector.add(1);

        vector.remove(2);
        vector.remove(3);

        System.out.println(vector);


        //CUATRO:
        System.out.println("""
        CUATRO RESPUESTA:\s
        Si se añaden 1000 elementos a un vector con la capacidad por defecto\s
        cada 10 elementos se crearía un nuevo array donde se copiarían los elementos del array anterior\s
        y se añadirían lo nuevos. Este proceso realizaría 100 veces, es decir, crearíamos 100 arrays\s
        generando un alto costo de memoria.\s
        """);

        //CINCO:
        System.out.println("CINCO | Crear ArrayList y copiar en LinkedList: ");

        ArrayList<String> listaCadena = new ArrayList<>();

        listaCadena.add("Elemento 1");
        listaCadena.add("Elemento 2");
        listaCadena.add("Elemento 3");
        listaCadena.add("Elemento 4");

        for (String elemento : listaCadena) {
            System.out.println("Valor del ArrayList: " + elemento);
        }

        LinkedList<String> listaEnlazadaCadena = new LinkedList<>(listaCadena);

        for (String elementoEnlazado : listaEnlazadaCadena) {
            System.out.println("Valor del LinkedList: " + elementoEnlazado);
        }


        //SEIS:
        System.out.println("SEIS | Operaciones con ArrayList");
        
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaEnteros.add(i);
        }

        for (int i = 0; i < listaEnteros.size(); i++) {
                listaEnteros.removeIf(n -> n % 2 == 0);
                System.out.println(listaEnteros.get(i));
        }


        //SIETE:
        System.out.println("SIETE | Gestión de Errores");

        try {
            int divideResultado = DividePorCero(1, 0);
            System.out.println("Resultado: " + divideResultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
            System.out.println("Excepción: " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }

        //OCHO:

        System.out.println("OCHO | COPIAR DATOS DE UN FICHERO A OTRO");

        copiarFichero("./src/com/ejecicio789/filein.txt","./src/com/ejecicio789/out.txt");
    }

    //CERO
    public static String reverse(String texto) {

        String nuevaCadena = null;
        for (int i = texto.length() - 1; i >= 0 ; i--) {
            String character = String.valueOf(texto.charAt(i));
            nuevaCadena += character;
        }
        return nuevaCadena;
    }

    public static int DividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void copiarFichero(String fileIn,String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
