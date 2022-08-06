package Ejercicio9;

public class EjercicioNueve {
    public static void main(String[] args) {
        //Objeto Cliente
        Cliente cliente = new Cliente(37, "Ricardo", "978887462", 5000.50);

        imprimir("Objeto Cliente");
        imprimir("------------------------");
        imprimir("Edad del cliente: " + cliente.getEdad());
        imprimir("Nombre del cliente: " + cliente.getNombre());
        imprimir("Teléfono del cliente: " + cliente.getTelefono());
        imprimir("Crédito del cliente: " + cliente.getCredito());
        imprimir();

        //Objeto Trabajador
        Trabajador trabajador = new Trabajador(23, "Juan", "801555468", 1090.66);

        imprimir("Objeto Trabajador");
        imprimir("------------------------");
        imprimir("Edad del cliente: " + trabajador.getEdad());
        imprimir("Nombre del cliente: " + trabajador.getNombre());
        imprimir("Teléfono del cliente: " + trabajador.getTelefono());
        imprimir("Crédito del cliente: " + trabajador.getSalario());
    }

    private static void imprimir(String x) {
        System.out.println(x);
    }

    private static void imprimir() {
        System.out.println(" ");
    }


}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;


    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



