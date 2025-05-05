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

    public Reservation(String roomType, int numberOfNights, boolean weekendStatus) {
        this.roomType = roomType;
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
        String roomType = getRoomType();
        float pricePerNight = getPrice();
        int numberOfNights = getNumberOfNights();
        boolean isWeekend = isWeekendStatus();
        float total;
        if(roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00f;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00f;
        }
        if(isWeekend) {
            float weekendFee;
            weekendFee = pricePerNight * 0.10f;
        }

        total = pricePerNight * numberOfNights;

        return total;
    }

    @Override
    public String toString() {
        return String.format("Your total for a " + roomType + " type room. For " + numberOfNights + " night(s) will be a total of: $" + getReservationTotal());
    }
}
