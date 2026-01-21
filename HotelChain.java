package com.ccp.hotel;

public class HotelChain {
    private Name name;
    private Hotel hotel;

    public HotelChain(Name name, Hotel hotel) {
        if(name == null || hotel == null) throw new IllegalArgumentException();
        this.name = name;
        this.hotel = hotel;
    }

    public Reservation makeReservation(RoomType type, HowMany count, ReserverPayer payer) {
        if(!hotel.available(type, count)) {
            throw new IllegalStateException("Rooms not available");
        }
        return hotel.createReservation(type, count, payer);
    }
}
