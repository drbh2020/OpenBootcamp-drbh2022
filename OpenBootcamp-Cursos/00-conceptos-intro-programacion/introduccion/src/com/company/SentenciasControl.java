package com.company;

public class SentenciasControl {

    public static void main(String[] args) {
    //Condicionales
        String estacion = "otoño";

        if (estacion.equals("primavera")) {
            System.out.println("Es primavera");
        } else if (estacion.equals("verano")) {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación...");
        }

    //Bucles
        //while
        int contador = 10;

        while (contador > 0) {
            System.out.println("While: " + contador);
            contador--;
        }
        //do while
        do {
            System.out.println("Do While: " + contador);
            contador--;
        } while (contador > 1);
        //for
        for (int contadors = 1; contadors <= 10; contadors++) {
            System.out.println(contadors);
        }

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("for valores: " + valores[i]);
        }
        
        int[] valores2 = {10, 20, 30, 40, 50};

        for (int i = 0; i < valores2.length; i++) {
            System.out.println("for valores2: " + valores2[i]);
        }

    //Switch Case
        var estacion2 = "verano";

        switch (estacion2) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(estacion2);
        }

        var hoy_es = "Martes";

        switch (hoy_es) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("hoy es laborable");
                break;
            default:
                System.out.println("hoy no es laborable");
        }
    }

}
