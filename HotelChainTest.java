package com.ccp.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelChainTest {

    @Test
    void shouldCreateReservation() {
        Hotel hotel = new Hotel(new Name("Test"), 1);
        HotelChain chain = new HotelChain(new Name("Chain"), hotel);
        RoomType type = new RoomType(RoomKind.STANDARD, new Money(1000));
        hotel.addRoomType(type);

        Reservation res = chain.makeReservation(type, new HowMany(1),
                new ReserverPayer(new Identity("ID"), new CreditCard("123")));

        assertNotNull(res);
    }
}
