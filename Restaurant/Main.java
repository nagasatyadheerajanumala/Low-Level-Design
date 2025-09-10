package com.Restaurant;

import com.Restaurant.Impl.BillingService;
import com.Restaurant.Impl.MenuService;
import com.Restaurant.Impl.NotificationService;
import com.Restaurant.Item.DrinkItem;
import com.Restaurant.Item.Menu;
import com.Restaurant.Item.NonVegetarianItem;
import com.Restaurant.Item.VegItem;
import com.Restaurant.customer.Customer;
import com.Restaurant.order.BookingManager;
import com.Restaurant.order.Table;
import com.Restaurant.service.IBillingService;
import com.Restaurant.service.IMenuService;
import com.Restaurant.service.INotificationService;

import java.awt.print.Book;

public class Main
{
    public static void main(String[] args) {
        IBillingService billingService = new BillingService();
        INotificationService notificationService = new NotificationService();
        IMenuService menuService = new MenuService();
        Menu menu = new Menu();
        menu.addItem(new VegItem("Paneer Tikka" , 5.5));
        menu.addItem(new VegItem("Veg sanwich", 5.0));
        menu.addItem(new NonVegetarianItem("Chicken biryani", 15.99));
        menu.addItem(new NonVegetarianItem("Mutton Biryani", 19.99));
        menu.addItem(new DrinkItem("Coke", 3.50));
        menuService.showMenu(menu);

        BookingManager manager = new BookingManager(notificationService, billingService);
        Customer dheeraj = new Customer("Dheeraj", 2);
        manager.bookTable(1, dheeraj);

        Table table = manager.getTable(1);
        table.addItemToOrder(new VegItem("paneer Tikka", 5.5));
        table.addItemToOrder(new DrinkItem("Coke", 3.5));

        manager.billTable(1);
    }
}
