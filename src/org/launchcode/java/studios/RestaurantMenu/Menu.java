package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    //menu constructor
    public Menu(Date dateUpdated, ArrayList<MenuItem> item) {
        this.lastUpdated = dateUpdated;
        this.items = item;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }


    //a way to tell when the menu was last updated
    public String updateDate(){
        return ("The menu was last updated: " + this.lastUpdated);
    }

    //a way to print out both a single men item as well as the entire menu
    public void printMenuItem(MenuItem item) {
        System.out.println(item.getDescription());
    }
    //print out all the items
    public void printWholeMenu(){
        for(MenuItem menuItem : this.items){
            System.out.println(menuItem.getDescription());
        }
    }

    public void addItems(MenuItem newItem1, MenuItem newItem2, MenuItem newItem3) {
        return;
    }


    public void addItem(MenuItem newItem1) {
            this.items.add(newItem1);

        }


    public void printMenu() {
    }

    public void printItem(MenuItem newItem1) {
    }

    public void removeItem(MenuItem newItem2) {
    }
}
//    public void setLastUpdated() {
//        //static methods are often used for repeatable tasks that don't rely on the data within an object
//        //locateDate is a class. this is a static method with .now();
//        this.lastUpdated = LocateDate.now();
//
//    }


