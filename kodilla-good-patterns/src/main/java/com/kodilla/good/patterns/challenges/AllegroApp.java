package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.informationservice.EmailConfirmation;
import com.kodilla.good.patterns.challenges.payingmethod.PayingCreditCard;
import com.kodilla.good.patterns.challenges.shippingmethod.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.shippingmethod.Ups;

public class AllegroApp {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequest();

        ProductOrderService buyingProcessor = new ProductOrderService(new PayingCreditCard(), new Ups(), new EmailConfirmation());
        buyingProcessor.process(orderRequest);
    }
}
