package com.iom.order.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String orderId) {
        super("Could not find Order " + orderId);
    }
}