package com.pluralsight;

public class Reservation {
    private String roomType;
    private float price;
    private int numberOfNights;
    private boolean weekendStatus;

    public Reservation() {
        this.roomType = "";
        this.price = 0.0f;
        this.numberOfNights = 0;
        this.weekendStatus = false;
    }

    public Reservation(String roomType, float price, int numberOfNights, boolean weekendStatus) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekendStatus = weekendStatus;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPrice() {
        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekendStatus() {
        return this.weekendStatus;
    }

    public void setWeekendStatus(boolean isWeekend) {
        this.weekendStatus = isWeekend;
    }

    public float getReservationTotal() {
        //Do math to get the total price for the reservation.
        return 0.0f;
    }
}
