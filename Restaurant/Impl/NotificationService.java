package com.Restaurant.Impl;

import com.Restaurant.customer.Customer;
import com.Restaurant.service.INotificationService;

public class NotificationService implements INotificationService {
    @Override
    public void sendConfirmation(Customer customer){
        System.out.println("Notification sent to: " + customer.getName() + "_your table is booked.");
    }
}
