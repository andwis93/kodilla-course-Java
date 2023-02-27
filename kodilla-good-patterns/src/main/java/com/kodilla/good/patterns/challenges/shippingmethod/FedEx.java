package com.kodilla.good.patterns.challenges.shippingmethod;

import com.kodilla.good.patterns.challenges.address.Address;
import com.kodilla.good.patterns.challenges.producttobuy.ProductToBuy;

public class FedEx implements ShippingMethod {
    private ShippingRequisition shippingRequisition;

    @Override
    public ShippingRequisition shippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems) {
        shippingRequisition = new ShippingRequisition(buyerName,shippingAddress,shippingItems);
        System.out.println("Shipped with FedEx");
        return shippingRequisition;
    }
}
