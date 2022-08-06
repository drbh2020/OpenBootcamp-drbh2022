package com.company;

public class Main {

    public static void main(String[] args) {
        int param1 = 10; // 4 bytes
        int param2 = 30; // 4 bytes

//        var valor = suma(param1,param2);

        System.out.println(param1);

        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }

//    public static int suma(int a, int b) {
//        int resultado = a + b;
//        System.out.println(resultado);
//
//        return suma(a, resultado);
//
//    }



}
class Potato {
    public int brazos = 0;

    public void QuitarBrazo() {
        this.brazos--;
    }
}
