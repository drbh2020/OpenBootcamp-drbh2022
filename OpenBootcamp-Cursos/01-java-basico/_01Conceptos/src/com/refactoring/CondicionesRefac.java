package com.refactoring;

public class CondicionesRefac {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    protected double calculateExtraSalary() {
        double result = 0;
        if (!isEligibleExtraSalary()) {
            return result;
        }

        //Calculate extra salary
        result += 5;

        return result;
    }

    private boolean isEligibleExtraSalary() {
        boolean estudios = seniority < 1 || education > 1; //categoria
        boolean experiencia = incidents > 10 || !certification; //categoria
        return estudios || experiencia;
    }

}
