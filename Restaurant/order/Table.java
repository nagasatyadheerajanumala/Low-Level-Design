package com.Restaurant.order;

import com.Restaurant.Item.MenuItem;
import com.Restaurant.customer.Customer;

public class Table {
    private int tableNumber;
    private Customer customer;
    private Order order;

    public Table(int tableNumber, Customer customer){
        this.tableNumber = tableNumber;
        this.customer = customer;
        this.order = new Order();
    }

    public void addItemToOrder(MenuItem item) {
        order.addItem(item);
    }

    public void displayBill() {
        System.out.println("Table #: " + tableNumber + " for "+customer.getName());
        order.printOrder();
    }

    public Order getOrder() { return this.order; }
}
