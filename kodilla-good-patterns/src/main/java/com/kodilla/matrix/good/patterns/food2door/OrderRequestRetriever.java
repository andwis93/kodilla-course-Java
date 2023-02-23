package com.kodilla.matrix.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    List<Product> productListToBuy = new ArrayList<>();
    List<Product> supplierProductList = new ArrayList<>();

    public List<Product> getSupplierProductList() {
        Product product1 = new Product("Apples", 20, 1.20);
        Product product2 = new Product("Blueberry", 25, 4.25);
        Product product3 = new Product("Tomatos", 30, .80);
        supplierProductList.add(product1);
        supplierProductList.add(product2);
        supplierProductList.add(product3);
        return supplierProductList;
    }

    public OrderRequest orderRequest() {
        Buyer buyer = new Buyer("Stokrotka");
        Address address = new Address("Poland", "Boblin", "12-345", "Skrzatow", "78A");
        BenefitsProvideBySupplier benefitsProvideBySupplier = new BenefitsProvideBySupplier(0.10,false);
        Producer producer = new Producer("ExtraFoodShop", address, getSupplierProductList());
        productListToBuy.add(new Product(producer.getProductList().get(0).getProductName(), 10, producer.getProductList().get(0).getPrice()));
        productListToBuy.add(new Product(producer.getProductList().get(2).getProductName(), 12, producer.getProductList().get(2).getPrice()));
        Supplier supplier = new Supplier(producer, benefitsProvideBySupplier);
        return new OrderRequest(1, buyer, supplier, productListToBuy);
    }

}

