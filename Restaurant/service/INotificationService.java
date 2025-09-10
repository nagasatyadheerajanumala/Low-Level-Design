package com.Restaurant.service;

import com.Restaurant.customer.Customer;

public interface INotificationService {
    void sendConfirmation(Customer customer);
}
