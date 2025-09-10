package com.Restaurant.customer;

public class Customer {
    private String name;
    private int partySize;
    public Customer(String name, int partySize) {
        this.name = name;
        this.partySize = partySize;
    }

    public String getName() {
        return this.name;
    }

    public int getPartySize() { return this.partySize; }
}
