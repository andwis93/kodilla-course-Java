package com.kodilla.matrix.good.patterns.challenges;

public class OrderDto {
    private Buyer buyer;
    private boolean isPayed;

    public OrderDto(Buyer buyer, boolean isPayed) {
        this.buyer = buyer;
        this.isPayed = isPayed;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
