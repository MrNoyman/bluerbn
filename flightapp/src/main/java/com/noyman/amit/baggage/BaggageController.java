package com.noyman.amit.baggage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/baggage")
public class BaggageController {

    @Autowired
    private BaggageService baggageService;

    @RequestMapping(value = "/checkin", method = RequestMethod.GET)
    public boolean checkin(int destId, int baggageId) {
        return baggageService.checkin(destId, baggageId);
    }
}
