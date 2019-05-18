package com.noyman.amit.exceptions;

public class InvalidCouponException extends Throwable {

    public InvalidCouponException(double price) {
        super("Invalid coupon, the price is " + price);
    }
}
