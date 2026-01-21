package com.ccp.hotel;

public class HowMany {
    private int number;

    public HowMany(int number) {
        if(number <= 0) throw new IllegalArgumentException("Invalid count");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
