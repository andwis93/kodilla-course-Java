package com.kodilla.matrix.good.patterns.food2door;

public class OrderDto {
    private Buyer buyer;
    private Supplier supplier;
    private boolean orderPlaced;

    public OrderDto(Buyer buyer, Supplier supplier, boolean orderPlaced) {
        this.buyer = buyer;
        this.supplier = supplier;
        this.orderPlaced = orderPlaced;
    }
}
