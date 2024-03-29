package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.informationservice.InformationService;
import com.kodilla.good.patterns.challenges.shippingmethod.ShippingMethod;
import com.kodilla.good.patterns.challenges.payingmethod.PayingMethod;

public class ProductOrderService {
    private PayingMethod payingMethod;
    private ShippingMethod shippingMethod;
    private InformationService informationService;

    public ProductOrderService(final PayingMethod payingMethod, final ShippingMethod shippingMethod,
                               final InformationService informationService) {
        this.payingMethod = payingMethod;
        this.shippingMethod = shippingMethod;
        this.informationService = informationService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isPayed = payingMethod.payingCompleted(orderRequest.getAmountToPay());
        if (isPayed){
            shippingMethod.shippingRequisition(orderRequest.getBuyer().getUserFullName(),orderRequest.getBuyer().getAddress(),
                    orderRequest.getProductToBuy());
            informationService.informBuyer(orderRequest.getFormOfConfirmation());

        }

        return new OrderDto(orderRequest.getBuyer(), isPayed);
    }
}


