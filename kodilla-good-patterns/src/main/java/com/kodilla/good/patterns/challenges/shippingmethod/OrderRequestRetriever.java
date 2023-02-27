package com.kodilla.good.patterns.challenges.shippingmethod;

import com.kodilla.good.patterns.challenges.Buyer;
import com.kodilla.good.patterns.challenges.Item;
import com.kodilla.good.patterns.challenges.OrderRequest;
import com.kodilla.good.patterns.challenges.address.Address;
import com.kodilla.good.patterns.challenges.address.AddressPoland;
import com.kodilla.good.patterns.challenges.payingmethod.PayingCreditCard;
import com.kodilla.good.patterns.challenges.payingmethod.PayingMethod;
import com.kodilla.good.patterns.challenges.payingmethod.PaymentCalculator;
import com.kodilla.good.patterns.challenges.producttobuy.Basket;
import com.kodilla.good.patterns.challenges.producttobuy.ProductToBuy;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest orderRequest() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        Address address = new AddressPoland("Poland", "Warsaw", "00-001", "Al. Niepodległości", "71/21");
        PayingMethod payingMethod = new PayingCreditCard();
        Buyer buyer = new Buyer("user1", "James", "Bond", address, "bond007@gmail.com", "7082651696", payingMethod);
        ProductToBuy productToBuy = new Basket(itemList());

        return new OrderRequest(buyer,productToBuy, paymentCalculator.calculatePayment(itemList()),buyer.getEmail());
    }
    private List<Item> itemList(){
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("ball","sport", 100.99));
        itemList.add(new Item("t-shirt","clothes", 50.99));
        return itemList;
    }
}

