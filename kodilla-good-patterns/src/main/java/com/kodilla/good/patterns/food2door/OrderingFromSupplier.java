package com.kodilla.good.patterns.food2door;

public class OrderingFromSupplier {

    public OrderDto process(final OrderRequest orderRequest) {
        Supplier supplier = orderRequest.getSupplier();
        boolean orderReleased = supplier.isOrderConfirmation(orderRequest);
        if (orderReleased) {
            System.out.println("Pay to supplier: " + calculatePrice(orderRequest) + "zł");
            if (orderRequest.getSupplier().getBenefitsProvideBySupplier().isFreeDelivery()) {
                System.out.println("Free shipping");
            } else {
                System.out.println("You have to pay for shipping");
            }
        }
        return new OrderDto(orderRequest.getBuyer(), orderRequest.getSupplier(), orderReleased);
    }

    public double calculatePrice(OrderRequest orderRequest) {
        double toPay = 0;
        for (Product product: orderRequest.getProductListToBuy()) {
            toPay += product.getQuantity() * product.getPrice();
        }
        System.out.println("Price before rebate: " + toPay + "zł");
        toPay = toPay - (toPay * orderRequest.getSupplier().getBenefitsProvideBySupplier().getRebate());
        return toPay;
    }
}
