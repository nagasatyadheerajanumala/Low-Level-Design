package com.Restaurant.service;

import com.Restaurant.order.Table;

public interface IBillingService {
    void generateBill(Table table);
}
