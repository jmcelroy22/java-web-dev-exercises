package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem(7.99, "Pizza", "Dinner", true);
        MenuItem newItem2 = new MenuItem(5.99, "Garlic Cheese Bread", "Appetizer", false);
        MenuItem newItem3 = new MenuItem(6.99, "Salad", "Salads", false);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);

        ourMenu.printMenu();

        ourMenu.printItem(newItem1);

        ourMenu.removeItem(newItem2);

        ourMenu.printMenu();

        //instance method - getters. public String getName and returns the name. Here we instantiate an
        // item MenuItem object in variable item. and calling the getName method on the instance of that object.
//        for(MenuItem item: menu.getMenuItems()){
//            System.out.println(item.getName);
//        }
//
//        menu.setLastUpdated();
//        System.out.println(menu.getLastUpdated());

    }
}
