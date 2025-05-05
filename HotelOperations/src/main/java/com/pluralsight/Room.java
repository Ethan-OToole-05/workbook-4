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
}
