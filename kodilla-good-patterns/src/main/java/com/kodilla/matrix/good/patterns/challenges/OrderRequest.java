package com.kodilla.matrix.good.patterns.challenges;

import com.kodilla.matrix.good.patterns.challenges.producttobuy.ProductToBuy;

public class OrderRequest {
    private Buyer buyer;

    private ProductToBuy productToBuy;

    private double amountToPay;
    private String formOfConfirmation;


    public OrderRequest(Buyer buyer, ProductToBuy productToBuy, double amountToPay,String formOfConfirmation) {
        this.buyer = buyer;
        this.productToBuy = productToBuy;
        this.amountToPay = amountToPay;
        this.formOfConfirmation = formOfConfirmation;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public ProductToBuy getProductToBuy() {
        return productToBuy;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public String getFormOfConfirmation() {
        return formOfConfirmation;
    }
}

