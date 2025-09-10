package com.Restaurant.order;

import com.Restaurant.Item.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        this.items.add(item);
    }

    public List<MenuItem> getItems(){
        return items;
    }

    public void printOrder() {
        System.out.println("_____ Order Summary _____");
        for(MenuItem item:items){
            System.out.println(item.getCategory() + " : "  + item.getName());
        }
    }
}
