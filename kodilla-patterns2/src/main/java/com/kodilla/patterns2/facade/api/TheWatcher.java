package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TheWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(TheWatcher.class);

    @Before(value = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&&  args(order, userId) && target(object)", argNames = "userId,order,object")
    public void logEvent(long userId, OrderDto order, Object object) {
        LOGGER.info("\nClass: " + object.getClass().getName() + "\nOrderId: " +
                order.getItems().toString() + "\nUserId: " + userId);
    }
}
