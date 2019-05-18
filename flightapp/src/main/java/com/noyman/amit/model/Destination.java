package com.noyman.amit.model;

public class Destination {

    private String name;

    private int destinationId;

    public Destination() {
    }

    public Destination(String name, int destinationId) {
        this.name = name;
        this.destinationId = destinationId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
