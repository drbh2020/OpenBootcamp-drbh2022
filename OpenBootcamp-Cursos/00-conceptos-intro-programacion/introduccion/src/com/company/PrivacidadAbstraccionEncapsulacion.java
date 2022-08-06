package com.company;

public class PrivacidadAbstraccionEncapsulacion {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        coche.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());
    }

}
//Privacidad y encapsulamiento
class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }
}

// Abstracción

abstract class Vehiculo2 {
    private String tipo;
    private int velocidadMaxima;

    private String sonido;

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}