package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");

    // CONCEPTO 1
        // OPCIÓN 1: Crear un objeto de forma normal
//        Calculadora servicio = new Calculadora();

        // OPCIÓN 2: Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        String texto = calculadora.holaMundo();
        System.out.println(texto + " a");
        // Se puede volver a obtener
        // OJO: Se recupera el mismo objeto
        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        String texto2 = calculadora2.holaMundo();
        System.out.println(texto2 + " b");

    // CONCEPTO 2
        // Cargar un bean dentr de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

    // CONCEPTO 3

    }
}