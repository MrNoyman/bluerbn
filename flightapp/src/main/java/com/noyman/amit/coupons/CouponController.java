package com.noyman.amit.coupons;

import com.noyman.amit.baggage.BaggageController;
import com.noyman.amit.exceptions.InvalidCouponException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/coupon")
public class CouponController {

    private final static Logger log = LogManager.getLogger(CouponController.class);

    @Autowired
    private CouponService couponService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String couponCheck(int couponId, double price) {
        log.traceEntry();
        try {
            double finalPrice = couponService.couponCheck(couponId, price);
            return Double.toString(finalPrice);
        } catch (InvalidCouponException e) {
            return e.getMessage();
        }
    }
}
