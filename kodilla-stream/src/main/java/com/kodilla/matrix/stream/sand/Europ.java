package com.kodilla.matrix.stream.sand;

import java.math.BigDecimal;

public class Europ implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890");
        return sandQuantity;
    }
}
