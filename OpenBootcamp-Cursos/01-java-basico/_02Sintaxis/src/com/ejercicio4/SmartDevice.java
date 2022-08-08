package com.ejercicio4;
/**
 *En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * <br/>
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * <br/>
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * <br/>
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class SmartDevice {

    public static void main(String[] args) {
        SmarthPhone smarthPhone = new SmarthPhone("Samsung", "SL", "azul", 9.5, 8, "Android" );
        SmarthWatch smarthWatch = new SmarthWatch("Xiaomi", "Deep", "gris", 3.7, 30.5, "Kurtion");

        System.out.println("SmarthPhone: " + smarthPhone);
        System.out.println("SmarthWatch: " + smarthWatch);
    }

    String marca;
    String modelo;
    String color;
    double pulgadas;


    public SmartDevice(){};

    public SmartDevice(String marca, String modelo, String color, double pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pulgadas = pulgadas;
    }

    static class SmarthPhone extends SmartDevice{
        int ram;
        String sistema;

        public SmarthPhone() {
        }

        public SmarthPhone(String marca, String modelo, String color, double pulgadas, int ram, String sistema) {
            super(marca, modelo, color, pulgadas);
            this.ram = ram;
            this.sistema = sistema;
        }

        @Override
        public String toString() {
            return "SmarthPhone {" +
                    "ram=" + ram +
                    ", sistema='" + sistema + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    ", pulgadas='" + pulgadas + '\'' +
                    '}';
        }
    }
    static class SmarthWatch extends SmartDevice{
        double alcance;
        String sensor;

        public SmarthWatch() {
        }

        public SmarthWatch(String marca, String modelo, String color, double pulgadas, double alcance, String sensor) {
            super(marca, modelo, color, pulgadas);
            this.alcance = alcance;
            this.sensor = sensor;
        }

        @Override
        public String toString() {
            return "SmarthWatch {" +
                    "alcance=" + alcance +
                    ", sensor='" + sensor + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    ", pulgadas='" + pulgadas + '\'' +
                    '}';
        }
    }
}


