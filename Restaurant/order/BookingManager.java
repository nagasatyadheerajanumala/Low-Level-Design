package com.Restaurant.order;

import com.Restaurant.customer.Customer;
import com.Restaurant.service.IBillingService;
import com.Restaurant.service.INotificationService;

import java.util.HashMap;
import java.util.Map;

public class BookingManager {
    private Map<Integer, Table> tableBookings = new HashMap<>();
    private IBillingService billingService;
    private INotificationService notificationService;

    public BookingManager(INotificationService notificationService, IBillingService billingService){
        this.notificationService = notificationService;
        this.billingService = billingService;
    }

    public void bookTable(int tableNumber, Customer customer){
        if (tableBookings.containsKey(tableNumber)) {
            System.out.println("Table: " + tableNumber + " is already booked.");
            return;
        }
        tableBookings.put(tableNumber, new Table(tableNumber, customer));
        System.out.println("Table: " + tableNumber + " booked for " + customer.getName());
        notificationService.sendConfirmation(customer);
    }

    public Table getTable(int tableNumber) {
        return tableBookings.get(tableNumber);
    }

    public void billTable(int tableNumber) {
        Table table = tableBookings.get(tableNumber);
        if(table!=null) {
            billingService.generateBill(table);
        }else System.out.println("No booking found");
    }
}
