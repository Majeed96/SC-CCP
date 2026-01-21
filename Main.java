package com.ccp.hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(new Name("Pearl Continental"), 101);
        HotelChain chain = new HotelChain(new Name("PC Chain"), hotel);

        RoomType deluxe = new RoomType(RoomKind.DELUXE, new Money(8000));
        hotel.addRoomType(deluxe);

        ReserverPayer payer = new ReserverPayer(
                new Identity("CNIC-12345"),
                new CreditCard("1111-2222-3333-4444")
        );

        Reservation reservation = chain.makeReservation(deluxe, new HowMany(1), payer);
        System.out.println("Reservation created: " + reservation.getNumber());
    }
}
