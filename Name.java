package com.ccp.hotel;

public class Name {
    private String value;

    public Name(String value) {
        if(value == null || value.isEmpty()) throw new IllegalArgumentException();
        this.value = value;
    }
}
