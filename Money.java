package com.ccp.hotel;

public class Money {
    private double amount;

    public Money(double amount) {
        if(amount <= 0) throw new IllegalArgumentException();
        this.amount = amount;
    }
}
