package com.company;

import java.util.Arrays;

public class GestionErrores {
    public static void main(String[] args) {
//  Error: No nombrar bien las variables
        //Fors para arrays de dos dimensiones o más
        int[][] numeros = {
                {10,20,30,40,50},
                {10,20,30,40,50}
        };

        // Al recorrer el array bidimensional numeros, por cada subarray del mismo
        // mostramos el valor que tienee en ese momento
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Primer for: " + i);
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Segundo for: " + numeros[i][j]);
            }
        }

//  Error: No comentar o comentar de más

        var temperatura = 15;
        if (temperatura == 15) {
            System.out.println("es 15");
        }

//  Error: No mantener la coherencia en el formato del código
    var temperatura2 = 15;
        if (temperatura2 == 15) {
System.out.println("es 15");
}
//  Error: Ni hacer copias de seguridad, ni versionar el código
//  Error:  No utilizar las formas complejas que provea un lenguaje, si hay formas más simples y legibles de hacerlo
        int[] numero2 = {10,20,30,40,50};

        // for (int i : numero2) { --> Son lo mismo
        for (int i = 0; i < numero2.length; i++) {
            System.out.println(i);
        }
        // Son iguales
        int variable = 0;
        int vari;
    }
}
