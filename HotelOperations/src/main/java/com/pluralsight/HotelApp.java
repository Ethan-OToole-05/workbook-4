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

        //checkIn(), checkOut(), cleanRoom(), and checkIn() logic check.
        System.out.println(room1);
        System.out.println(reservation1);
        room1.checkIn();
        System.out.println(room1);
        room1.checkIn();
        room1.checkOut();
        System.out.println(room1);
        room1.cleanRoom();
        System.out.println(room1);

        
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("Employee1 Pay: $" + employee1.getTotalPay());
        System.out.println("Employee2 Pay: $" + employee2.getTotalPay());


    }
}
