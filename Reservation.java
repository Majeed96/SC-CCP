package com.ccp.hotel;

public class Reservation {
    private static int counter = 1;
    private int number;
    private RoomType roomType;
    private ReserverPayer payer;

    public Reservation(RoomType roomType, ReserverPayer payer) {
        this.number = counter++;
        this.roomType = roomType;
        this.payer = payer;
    }

    public int getNumber() {
        return number;
    }
}
