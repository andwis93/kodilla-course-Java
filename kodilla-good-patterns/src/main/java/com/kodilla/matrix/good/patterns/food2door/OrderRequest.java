package com.kodilla.matrix.good.patterns.food2door;

import java.util.List;

public class OrderRequest {
    private int orderNumber;
    private Buyer buyer;
    private Supplier supplier;
    private List<Product> productListToBuy;

    public OrderRequest(int orderNumber, Buyer buyer, Supplier supplier, List<Product> productListToBuy) {
        this.orderNumber = orderNumber;
        this.buyer = buyer;
        this.supplier = supplier;
        this.productListToBuy = productListToBuy;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getProductListToBuy() {
        return productListToBuy;
    }
}

