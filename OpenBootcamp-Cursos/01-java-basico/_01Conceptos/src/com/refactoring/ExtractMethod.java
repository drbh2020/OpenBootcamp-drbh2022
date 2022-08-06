package com.refactoring;

public class ExtractMethod {

    void printHTML() {
        printHead();
        printBody();
        printFooter();
    }

    //Se extrajo este código de printHTML()
    private void printFooter() {
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println(" ");
    }

    private void printBody() {
    }
    private void printHead() {
    }
}
