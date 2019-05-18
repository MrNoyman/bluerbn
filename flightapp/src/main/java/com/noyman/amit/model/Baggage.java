package com.noyman.amit.model;

public class Baggage {

    private int baggageId;

    private int passengerId;

    public Baggage() {
    }

    public Baggage(int baggageId, int passengerId) {
        this.baggageId = baggageId;
        this.passengerId = passengerId;
    }


    public int getBaggageId() {
        return baggageId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
}
