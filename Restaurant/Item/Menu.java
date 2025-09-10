package com.Restaurant.Item;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayMenu()
    {
        System.out.println("______Full Menu_____");
        for(MenuItem item: items) {
            System.out.println(item.getCategory() + ": " + item.getName() + ": " + item.getPrice());
        }
    }

    public List<MenuItem> getItemByType(String type) {
        List<MenuItem> filteredItems = new ArrayList<>();
        for(MenuItem item: items){
            if(item.getCategory().equalsIgnoreCase(type)){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }
}
