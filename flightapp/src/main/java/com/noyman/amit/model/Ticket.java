package com.noyman.amit.model;

import java.time.ZonedDateTime;

public class Ticket {

    private int id;

    private int passengerId;

    private int destinationId;

    private ZonedDateTime boardingTime;

    public Ticket() {
    }

    public Ticket(int id, int passengerId, int destinationId, ZonedDateTime boardingTime) {
        this.id = id;
        this.passengerId = passengerId;
        this.destinationId = destinationId;
        this.boardingTime = boardingTime;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getId() {
        return id;
    }

    public ZonedDateTime getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(ZonedDateTime boardingTime) {
        this.boardingTime = boardingTime;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
}
