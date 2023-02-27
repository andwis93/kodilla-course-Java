package com.kodilla.good.patterns.flights;

import java.time.Duration;
import java.time.LocalDateTime;

public class CompareTime {
    public boolean compareTime(LocalDateTime localDateTime1, LocalDateTime localDateTime2, int amountOfHours) {
        boolean lessThenGivenHours = false;
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        if((duration.toHours()<amountOfHours) && (duration.toHours()>0))
            lessThenGivenHours = true;
        return lessThenGivenHours;
    }
}