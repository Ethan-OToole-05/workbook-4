package com.pluralsight;

public class Player {
    private Player() {}

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String firstName) {
        return firstName;
    }
}
