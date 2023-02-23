package com.kodilla.matrix.good.patterns.food2door;

import java.util.List;

public class Producer {
    private String producerName;
    private Address address;
    private List<Product> productList;

    public Producer(String producerName, Address address, List<Product> productList) {
        this.producerName = producerName;
        this.address = address;
        this.productList = productList;
    }

    public Address getAddress() {
        return address;
    }

    public List<Product> getProductList() {
        return productList;
    }
}

