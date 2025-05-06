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

    public int getAvailableRooms() {
        //rooms class needed?
        int availableRooms = 0;
        availableRooms = this.numberOfRooms - bookedBasicRooms;
        if(availableRooms > 0 ) {
            return availableRooms;
        }
        else {
            return 0;
        }
    }

    public int getAvailableSuites() {
        //what makes a room a suite?
        int availableSuites = 0;
        availableSuites = this.numberOfRooms - bookedSuites;
        if(availableSuites > 0 ) {
            return availableSuites;
        }
        else {
            return 0;
        }
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        //get the number of rooms available by occupied status.
        boolean canBook = true;
        if(getAvailableRooms() < numberOfRooms) {
            canBook = false;
            return canBook;
        }
        if(isSuite && getAvailableSuites() < numberOfRooms ) {
            canBook = false;
            return canBook;
        }
        return canBook;
    }
}

