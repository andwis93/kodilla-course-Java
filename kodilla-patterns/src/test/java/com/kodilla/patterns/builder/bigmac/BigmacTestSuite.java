package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .BreadType(Bread.BUN)
                .Burgers(Burgers.DOUBLE)
                .SauceType(Sauce.BARBECUE)
                .ingredient("pickel")
                .ingredient("onion rings")
                .ingredient("bacon")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When & Then
        assertEquals("bun", bigmac.getBreadType());
        assertEquals(2, bigmac.getBurgers());
        assertEquals("barbecue", bigmac.getSauceType());
        assertEquals(4, bigmac.getIngredients().size());
    }

}