package com.noyman.amit.coupons;

import com.noyman.amit.data.DataCenter;
import com.noyman.amit.exceptions.InvalidCouponException;
import com.noyman.amit.model.Coupon;
import com.noyman.amit.tickets.TicketController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Optional;

@Service
public class CouponService {

    private final static Logger log = LogManager.getLogger(CouponService.class);

    @Autowired
    private DataCenter dataCenter;

    public double couponCheck(int couponId, double price) throws InvalidCouponException {
        log.trace("Entry to couponCheck with params: coupon id - {}, price  {}", couponId, price);
        double finalPrice;
        Optional<Coupon> optionalCoupon =dataCenter.getCoupons().stream().filter(c -> c.getCouponId() == couponId).findFirst();
        Coupon coupon = optionalCoupon.orElseThrow(() -> new InvalidCouponException(price));
        if (coupon.getValidDate().isBefore(ZonedDateTime.now()) && coupon.getPercentage() > 0.0) {
            throw new InvalidCouponException(price);
        }
        finalPrice = price * (coupon.getPercentage() / 100);
        log.traceExit("Full price is {}", price);
        return finalPrice;
    }
}
