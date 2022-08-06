package com.ejecicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precioInicial = scanner.nextDouble();

        System.out.println("El precio con IVA es: " + precioIVA(precioInicial));

    }

    private static final double  IVA = 0.18;
    private static double precioIVA(double precioSinIVA) {
        double calcularIva = precioSinIVA * IVA;
        return precioSinIVA + calcularIva;
    }

}
