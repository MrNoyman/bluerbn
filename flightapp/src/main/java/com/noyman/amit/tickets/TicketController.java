package com.noyman.amit.tickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/valid", method = RequestMethod.GET)
    public boolean isValid(Integer ticketId) {
        return ticketService.isValidTicket(ticketId);
    }




}
