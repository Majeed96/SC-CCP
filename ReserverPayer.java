package com.ccp.hotel;

public class ReserverPayer {
    private Identity id;
    private CreditCard card;

    public ReserverPayer(Identity id, CreditCard card) {
        this.id = id;
        this.card = card;
    }
}
