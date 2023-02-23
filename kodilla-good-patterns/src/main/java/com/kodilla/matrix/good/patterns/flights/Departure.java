package com.kodilla.matrix.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class Departure {
    String flyingFrom;
    LocalDateTime departureDateTime;

    public Departure(String flyingFrom, int year, int month, int day, int hour, int min) {
        this.flyingFrom = flyingFrom;
        this.departureDateTime = LocalDateTime.of(year,month,day,hour,min);
    }

    public String getFlyingFrom() {
        return flyingFrom;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departure departure)) return false;
        return Objects.equals(getFlyingFrom(), departure.getFlyingFrom()) && Objects.equals(departureDateTime, departure.departureDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlyingFrom(), departureDateTime);
    }

    @Override
    public String toString() {
        return "DEPARTURE: " +
                '\'' + flyingFrom + '\'' +
                "\nDate: " + departureDateTime.getYear() + "-" + departureDateTime.getMonthValue() + "-" +
                departureDateTime.getDayOfMonth() + "\nTime: " + departureDateTime.getHour() + ":" + departureDateTime.getMinute();
    }
}

