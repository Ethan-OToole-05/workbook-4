package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfSuites() {
        return this.numberOfSuites;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public int getBookedSuites() {
        return this.bookedSuites;
    }

    public int getBookedBasicRooms() {
        return this.bookedBasicRooms;
    }
}

