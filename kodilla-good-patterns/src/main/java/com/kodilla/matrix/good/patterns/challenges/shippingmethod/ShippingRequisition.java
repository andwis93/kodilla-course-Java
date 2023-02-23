package com.kodilla.matrix.good.patterns.challenges.shippingmethod;

import com.kodilla.matrix.good.patterns.challenges.address.Address;
import com.kodilla.matrix.good.patterns.challenges.producttobuy.ProductToBuy;

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
