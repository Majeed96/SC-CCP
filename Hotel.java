package com.ccp.hotel;

import java.util.*;

public class Hotel {
    private Name name;
    private int number;
    private List<RoomType> roomTypes = new ArrayList<>();

    public Hotel(Name name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addRoomType(RoomType type) {
        roomTypes.add(type);
    }

    public boolean available(RoomType type, HowMany count) {
        return count.getNumber() > 0;
    }

    public Reservation createReservation(RoomType type, HowMany count, ReserverPayer payer) {
        return new Reservation(type, payer);
    }
}
