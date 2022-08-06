package com.refactoring;

public class CodigoDuplicadoRefac {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    protected double calculateExtraSalary() {
        double result = 0;
        if (!isEligibleExtraSalary()) {
            result = 500;
            //sendMessage(); // método que se repite en la condición
        } else {
            result = 0;
            //sendMessage(); // método que se repite en la condición
        }
        sendMessage(); // ahora el método no se repite
        return result;
    }

    private void sendMessage(){
        //send email
        //connect smtp
        System.out.println("Sending message");
    }

    private boolean isEligibleExtraSalary() {
        boolean estudios = seniority < 1 || education > 1; //categoria
        boolean experiencia = incidents > 10 || !certification; //categoria
        return estudios || experiencia;
    }
}
