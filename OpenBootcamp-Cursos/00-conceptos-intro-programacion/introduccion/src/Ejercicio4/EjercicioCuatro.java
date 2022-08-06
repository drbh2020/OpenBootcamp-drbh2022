package Ejercicio4;

public class EjercicioCuatro {
    public static void main(String[] args) {

        // Pregunta 1: IF
        int numeroIf  = 19;

        if (numeroIf  > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf  < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        //Pregunta 2: WHILE
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("While: " + numeroWhile);
        }

        //Pregunta 3: DO WHILE
        int numeroDoWhile = 3;

         do{
             numeroDoWhile++;
            System.out.println("Do While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

         //Pregunta 4: FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Pregunta 5: SWITCH
        String estacion = "INVIERNO";

        switch (estacion) {
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            default:
                System.out.println("No es una estación del año");
        }

    }
}
