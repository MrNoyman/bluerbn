package com.noyman.amit.baggage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/baggage")
public class BaggageController {

    private final static Logger log = LogManager.getLogger(BaggageController.class);

    @Autowired
    private BaggageService baggageService;

    @RequestMapping(value = "/checkin", method = RequestMethod.GET)
    public boolean checkin(int destId, int baggageId) {
        log.traceEntry();
        return baggageService.checkin(destId, baggageId);
    }
}
