package com.kodilla.exception.test;

public class RouteNoFoundException extends Exception{
    public RouteNoFoundException(final String message) {
        super(message);
    }
}
