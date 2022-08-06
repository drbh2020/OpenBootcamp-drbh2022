package com.tipos;

public class NameFormatException extends Exception{

    public static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }
}
