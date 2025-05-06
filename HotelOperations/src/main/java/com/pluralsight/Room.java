package com.pluralsight;

public class Room {
    private int beds;
    private float price;
    private boolean occupiedStatus;
    private boolean cleanStatus;

    public Room() {
        this.beds = 0;
        this.price = 0.0f;
        this.occupiedStatus = false;
        this.cleanStatus = true;
    }

    public Room(int beds, float price, boolean occupiedStatus, boolean cleanStatus) {
        this.beds = beds;
        this.price = price;
        this.occupiedStatus = occupiedStatus;
        this.cleanStatus = cleanStatus;
    }

    public int getNumberOfBeds() {
        return this.beds;
    }

    public float getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.occupiedStatus;
    }

    public boolean isDirty() {
        return this.cleanStatus;
    }

    public boolean isAvailable(){
        return this.occupiedStatus;
    }

    @Override
    public String toString() {
        return String.format("Number of beds: %s | Price a night: $%.2f | Occupied: %s | Clean Status: %s", beds, price, occupiedStatus, cleanStatus);
    }

    public void checkIn() {

        if(this.occupiedStatus || !this.cleanStatus) {
            System.out.println("Sorry this room is unavailable.");
        }
        else {
            this.occupiedStatus = true;
            this.cleanStatus = false;
        }

    }

    public void checkOut() {
        this.occupiedStatus = false;
    }

    public void cleanRoom() {
        this.cleanStatus = true;
    }
}
