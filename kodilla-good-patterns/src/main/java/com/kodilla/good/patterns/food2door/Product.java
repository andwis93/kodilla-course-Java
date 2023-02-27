package com.kodilla.good.patterns.food2door;

public class Product {
    private String productName;
    private double quantity;
    private double price;

    public Product(String productName, double quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

