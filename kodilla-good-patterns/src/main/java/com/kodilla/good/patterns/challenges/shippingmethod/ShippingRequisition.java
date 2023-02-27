package com.kodilla.good.patterns.challenges.shippingmethod;

import com.kodilla.good.patterns.challenges.address.Address;
import com.kodilla.good.patterns.challenges.producttobuy.ProductToBuy;

public class ShippingRequisition {

    private final String buyerName;
    private Address shippingAddress;

    private ProductToBuy shippingItems;

    public ShippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems) {
        this.buyerName = buyerName;
        this.shippingAddress = shippingAddress;
        this.shippingItems = shippingItems;
    }

}
