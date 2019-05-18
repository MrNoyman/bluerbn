package com.noyman.amit.baggage;

import com.noyman.amit.FlightApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlightApp.class)
public class BaggageServiceTest {

    @Autowired
    private BaggageService baggageService;

    @Test
    public void checkin() {
        boolean answer = baggageService.checkin(-1, -1);
        assertFalse(answer);
    }
}