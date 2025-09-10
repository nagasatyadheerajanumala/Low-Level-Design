package com.Restaurant.Item;

public class DrinkItem implements MenuItem {
    private String name;
    private double price;

    public DrinkItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String getCategory() {return "Drinks"; }
}
