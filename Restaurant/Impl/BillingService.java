package com.Restaurant.Impl;

import com.Restaurant.Item.MenuItem;
import com.Restaurant.order.Table;
import com.Restaurant.service.IBillingService;

public class BillingService implements IBillingService {
    @Override
    public void generateBill(Table table){
        double total = 0;
        System.out.println("\n_____Generating Bill_____");
        table.displayBill();
        for(MenuItem item: table.getOrder().getItems()){
            total += item.getPrice();
        }
        System.out.println("Total amount: $" + total);
    }

}
