package com.kodilla.matrix.good.patterns.challenges;

public class Item {

    private String itemName;
    private String itemCategory;
    private double itemPrice;


    public Item(String itemName, String itemCategory, double itemPrice) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

