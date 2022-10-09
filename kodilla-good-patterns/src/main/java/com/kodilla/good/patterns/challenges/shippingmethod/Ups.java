package com.kodilla.good.patterns.challenges.shippingmethod;

import com.kodilla.good.patterns.challenges.address.Address;
import com.kodilla.good.patterns.challenges.producttobuy.ProductToBuy;

public class Ups implements ShippingMethod {
    private ShippingRequisition shippingRequisition;
    @Override
    public ShippingRequisition shippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems) {
        System.out.println("Shipped with UPS");
        return shippingRequisition;
    }

}