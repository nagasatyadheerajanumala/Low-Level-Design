package com.Restaurant.Item;

public class NonVegetarianItem implements MenuItem {
    private String name;
    private double price;

    public NonVegetarianItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String getCategory() { return "NonVegetarian"; }
}
