package com.Restaurant.Item;

public class VegItem implements MenuItem{
    private String name;
    private double price;

    public VegItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String getCategory() { return "Vegetarian"; }
}
