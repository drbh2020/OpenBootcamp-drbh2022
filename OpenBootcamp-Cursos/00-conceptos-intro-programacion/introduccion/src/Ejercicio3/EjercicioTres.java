package Ejercicio3;

public class EjercicioTres {
    public static void main(String[] args) {
        //Primera parte
        int resultado;
        resultado = sumaTresParametros(10,20,30);
        System.out.println("Suma de tres parámetros: " + resultado);
        //Primera parte
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.println("Puertas del objeto Coche: " + miCoche.numeroPuertas);
    }

    public static int sumaTresParametros(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int numeroPuertas;

    public void incrementarPuertas() {
        this.numeroPuertas++;
    }
}


