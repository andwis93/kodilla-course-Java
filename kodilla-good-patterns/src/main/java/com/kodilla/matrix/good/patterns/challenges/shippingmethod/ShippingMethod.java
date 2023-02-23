package com.kodilla.matrix.good.patterns.challenges.shippingmethod;

import com.kodilla.matrix.good.patterns.challenges.address.Address;
import com.kodilla.matrix.good.patterns.challenges.producttobuy.ProductToBuy;

public interface ShippingMethod {
    ShippingRequisition shippingRequisition(String buyerName, Address shippingAddress, ProductToBuy shippingItems);

}
