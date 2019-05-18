package com.noyman.amit.coupons;

import com.noyman.amit.exceptions.InvalidCouponException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String couponCheck(int couponId, double price) {
        try {
            double finalPrice = couponService.couponCheck(couponId, price);
            return Double.toString(finalPrice);
        } catch (InvalidCouponException e) {
            return e.getMessage();
        }
    }
}
