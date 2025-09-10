package com.Restaurant.Impl;

import com.Restaurant.Item.Menu;
import com.Restaurant.service.IMenuService;

public class MenuService implements IMenuService {
    @Override
    public void showMenu(Menu menu){
        menu.displayMenu();
    }
}
