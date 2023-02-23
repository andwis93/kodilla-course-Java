package com.kodilla.matrix.good.patterns.challenges.shippingmethod;

import com.kodilla.matrix.good.patterns.challenges.address.Address;
import com.kodilla.matrix.good.patterns.challenges.producttobuy.ProductToBuy;

public class Ups implements ShippingMethod {
    private ShippingRequisition shippingRequisition;
    @Override
    public ShippingRequisition shippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems) {
        System.out.println("Shipped with UPS");
        return shippingRequisition;
    }

}