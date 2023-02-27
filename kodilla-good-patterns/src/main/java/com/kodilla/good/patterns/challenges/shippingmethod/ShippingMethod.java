package com.kodilla.good.patterns.challenges.shippingmethod;

import com.kodilla.good.patterns.challenges.address.Address;
import com.kodilla.good.patterns.challenges.producttobuy.ProductToBuy;

public interface ShippingMethod {
    ShippingRequisition shippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems);

}
