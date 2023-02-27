package com.kodilla.good.patterns.challenges.payingmethod;

import com.kodilla.good.patterns.challenges.Item;

import java.util.List;

public class PaymentCalculator {
    public double calculatePayment(List<Item> itemList){
        double amountToPay = 0;
        for(Item item: itemList){
            amountToPay += item.getItemPrice();
        }
        return amountToPay;
    }
}