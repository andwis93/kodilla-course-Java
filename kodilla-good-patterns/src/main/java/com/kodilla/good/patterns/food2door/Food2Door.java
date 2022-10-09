package com.kodilla.good.patterns.food2door;

public class Food2Door {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequest();

        OrderingFromSupplier orderingFromSupplier = new OrderingFromSupplier();
        orderingFromSupplier.process(orderRequest);
    }
}
