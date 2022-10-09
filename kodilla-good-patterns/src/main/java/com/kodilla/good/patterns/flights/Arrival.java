package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class Arrival {
    String flyingTo;
    LocalDateTime arrivalDateTime;

    public Arrival(String flyingTo, int year, int month, int day, int hour, int min) {
        this.flyingTo = flyingTo;
        this.arrivalDateTime = LocalDateTime.of(year,month,day,hour,min);
    }

    public String getFlyingTo() {
        return flyingTo;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arrival arrival)) return false;
        return Objects.equals(getFlyingTo(), arrival.getFlyingTo()) && Objects.equals(arrivalDateTime, arrival.arrivalDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlyingTo(), arrivalDateTime);
    }

    @Override
    public String toString() {
        return "ARRIVAL: " +
                '\'' + flyingTo + '\'' +
                "\nDate: " + arrivalDateTime.getYear() + "-" + arrivalDateTime.getMonthValue() + "-" +
                arrivalDateTime.getDayOfMonth() + "\nTime " + arrivalDateTime.getHour() + ":" + arrivalDateTime.getMinute() +"\n";
    }
}

