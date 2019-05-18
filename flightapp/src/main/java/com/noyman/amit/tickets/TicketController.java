package com.noyman.amit.tickets;

import com.noyman.amit.coupons.CouponController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    private final static Logger log = LogManager.getLogger(TicketController.class);

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/valid", method = RequestMethod.GET)
    public boolean isValid(Integer ticketId) {
        log.traceEntry();
        return ticketService.isValidTicket(ticketId);
    }




}
