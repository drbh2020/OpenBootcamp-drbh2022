package string;

public class Main {
    public static void main(String[] args) {
        var cadena = "Mensaje de TEXto";

    /*
        //Método length
        int cadenaLength = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLength);

        //Método .toLowerCase();
        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinuscula);

        //Método .toUpperCase();
        String cadenaMayuscula = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayuscula);

        //Método .startsWith()
        boolean resultadoStart = cadena.startsWith("Men");

        if(resultadoStart) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }
        //Método .endsWith()
        boolean resultadoEnd = cadena.endsWith("o");

        if(resultadoStart) {
            System.out.println("Si acaba");
        } else {
            System.out.println("No acaba");
        }

        //Método .charAt(index)
        char letra = cadena.charAt(0);
        System.out.println("Carácter es: " + letra);
    */
        //Recorrer una cadena
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Carácter actual: " + cadena.charAt(i));
        }

        //Darle la vuelta a una cadena
        String nuevaCadena = "";
        for (int i = cadena.length() - 1; i >= 0 ; i--) {
            String character = String.valueOf(cadena.charAt(i));
            nuevaCadena  += character;
        }
        System.out.println(nuevaCadena);
    }

}
