package com.kodilla.good.patterns.food2door;

public class Supplier {
    private Producer producer;
    private BenefitsProvideBySupplier benefitsProvideBySupplier;

    public Supplier(Producer producer, BenefitsProvideBySupplier benefitsProvideBySupplier) {
        this.producer = producer;
        this.benefitsProvideBySupplier = benefitsProvideBySupplier;
    }

    public BenefitsProvideBySupplier getBenefitsProvideBySupplier() {
        return benefitsProvideBySupplier;
    }

    public boolean isOrderConfirmation(OrderRequest orderRequest){
        System.out.println("Order nr: " + orderRequest.getOrderNumber() + " was accepted.");
        return true;
    }
}

