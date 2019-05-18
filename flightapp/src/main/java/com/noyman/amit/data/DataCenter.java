package com.noyman.amit.data;

import com.noyman.amit.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataCenter {

    private List<Ticket> tickets = new ArrayList<>();

    private List<Baggage> baggages = new ArrayList<>();

    private List<Destination> destinations = new ArrayList<>();

    private List<User> users = new ArrayList<>();

    private List<Coupon> coupons = new ArrayList<>();

    @PostConstruct
    public void init() {
        users.add(new User("Amit", 1));
        users.add(new User("Liran", 2));
        users.add(new User("Bar", 3));
        users.add(new User("Gal", 4));
        users.add(new User("Tal", 5));

        tickets.add(new Ticket(1, 1, 1, ZonedDateTime.now().plus(5, ChronoUnit.DAYS)));
        tickets.add(new Ticket(2, 2, 2, ZonedDateTime.now().plus(1, ChronoUnit.DAYS)));
        tickets.add(new Ticket(3, 3, 3, ZonedDateTime.now().plus(5, ChronoUnit.HOURS)));
        tickets.add(new Ticket(4, 4, 4, ZonedDateTime.now().minus(15, ChronoUnit.DAYS)));
        tickets.add(new Ticket(5, 5, 5, ZonedDateTime.now().plus(1, ChronoUnit.DAYS)));

        destinations.add(new Destination("NYC", 1));
        destinations.add(new Destination("London", 2));
        destinations.add(new Destination("Paris", 3));
        destinations.add(new Destination("Madrid", 4));
        destinations.add(new Destination("Lisbon", 5));

        coupons.add(new Coupon(30.0, 1, ZonedDateTime.now().plus(5, ChronoUnit.DAYS)));
        coupons.add(new Coupon(5.0, 2, ZonedDateTime.now().plus(5, ChronoUnit.HOURS)));

        baggages.add(new Baggage(1, 1));
        baggages.add(new Baggage(2, 1));
        baggages.add(new Baggage(3, 2));
        baggages.add(new Baggage(4, 3));
        baggages.add(new Baggage(5, 4));

    }

    public boolean isValidUser(int userId) {
        return users.stream().anyMatch(u -> u.getId() == userId);
    }

    public boolean isValidDestination(int destId) {
        return destinations.stream().anyMatch(u -> u.getDestinationId() == destId);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Baggage> getBaggages() {
        return baggages;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public List<User> getUsers() {
        return users;
    }
}
