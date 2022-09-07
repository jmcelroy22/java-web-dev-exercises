package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {
    private String name;
    private double price;

    private String description;

    private String category;

    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew){
        //this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price){
        this.price = price;

    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setNew(boolean aNew){
        isNew = isNew;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }

    public String isItemNew() {
        if(this.isNew == true) {
            return "Try this tasty new dish";
        } else {
            return "very old";
        }
    }
    //a way to determine whether or not two menu items are equal
    public boolean isEqual(MenuItem compareItem) {
        if ( this == compareItem) {
            return true;
        } else {
            return false;
        }
    }

}



