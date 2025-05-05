package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {
        Room room1 = new Room(4, 175.00f, false, true);
        Room room2 = new Room(2, 99.99f, false, true);
        Room room3 = new Room(1, 49.99f, false, true);

        Reservation reservation1 = new Reservation("king", 4, false);

        Employee employee1 = new Employee("John Doe", "Kitchen", 20.00f, 30.0f);
        Employee employee2 = new Employee("TestMan", "Security", 30.00f, 45.0f);
        System.out.println("Welcome to the best hotel!");
        System.out.println("Here are all of our rooms: ");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(reservation1);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee2.getTotalPay());


    }
}
