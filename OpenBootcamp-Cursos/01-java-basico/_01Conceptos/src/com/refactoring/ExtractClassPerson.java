package com.refactoring;

public class ExtractClassPerson {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;

    // address
    private ExtractClassAddress address; // cadinalidad? puede ser cualquierda
}
