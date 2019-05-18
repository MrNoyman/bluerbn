package com.noyman.amit.model;

import java.time.ZonedDateTime;

public class Coupon {

    private double percentage;

    private int couponId;

    private ZonedDateTime validDate;


    public Coupon() {
    }

    public Coupon(double percentage, int couponId, ZonedDateTime validDate) {
        this.percentage = percentage;
        this.couponId = couponId;
        this.validDate = validDate;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getCouponId() {
        return couponId;
    }

    public ZonedDateTime getValidDate() {
        return validDate;
    }

    public void setValidDate(ZonedDateTime validDate) {
        this.validDate = validDate;
    }
}
