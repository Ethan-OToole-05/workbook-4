package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void valid_CheckIn() {
        //Arrange
        Employee employee1 = new Employee();

        //Act
        employee1.punchIn(7.0);
        boolean result = employee1.getPunchInTime() > 0;
        boolean hoursWorkedResult = employee1.getHoursWorked() > 0;

        //Assert
        assertTrue(result);
        assertEquals(7.0, employee1.getPunchInTime());

        //TEST FAILED NOT ADDING HOURSWORKED AFTER PUNCHING IN.
        assertTrue(hoursWorkedResult);

    }

    @Test
    public void checkOut() {
    }

    @Test
    public void cleanRoom() {
    }
}