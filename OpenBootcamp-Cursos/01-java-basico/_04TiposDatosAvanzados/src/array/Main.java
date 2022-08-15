package array;

public class Main {
    public static void main(String[] args) {

        //Indicando el tamaño del array sin saber que dato serán ingresados
        /*
        int[] arrayUno = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i : arrayUno) {
            System.out.println(i);
        }
        */

        //Inicializando el array sabiendo que datos serán ingresados
        /*
        int[] arrayUno = {1, 2, 3, 4, 5};


        System.out.println("Longitud del array: " + arrayUno.length);

        for (int i : arrayUno) {
            System.out.println(i);
        }
        */

        //Tipos de for usados para iterar en Arrays
        /*
        String[] nombres = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        for (String nombre: nombres) {
            System.out.println("Nombre actual: " + nombre);
        }

        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actual: " + nombres[i] + " en posición: " + i);
            ultimoNombre = nombres[i];
        }
        System.out.println(ultimoNombre);
        */

        //Dimensiones de un Array: Bidimensional

        int[][] arrayBidimensional = new int[2][4];

        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[0][2] = 3;
        arrayBidimensional[0][3] = 4;

        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;
        arrayBidimensional[1][2] = 30;
        arrayBidimensional[1][3] = 40;

        //Un array de arrays
        int[][] arrayBidimensional2 = {
                {1,2,3,4},
                {10,20,30,40}
        };

        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidimensional[i][j]);
            }
        }

    }
}
