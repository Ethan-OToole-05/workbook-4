package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    public Employee() {
        this.employeeId = (int) (Math.random() * 1000) + 1;
        this.name = "";
        this.department = "";
        this.payRate = 0.0f;
        this.hoursWorked = 0.0f;
    }

    public Employee(String name, String department, float payRate, float hoursWorked) {
        this.employeeId = (int) (Math.random() * 1000) + 1;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getPayRate() {
        return payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getRegularHours() {
        float hoursWorked = getHoursWorked(), hoursOver = 0.0f, payRate = getPayRate(), regularPay = 0.0f;
        if(hoursWorked > 40.0) {
            hoursOver = hoursWorked - 40.0f;
            hoursWorked = hoursWorked - hoursOver;
            regularPay = hoursWorked * payRate;
        }
        else {
            regularPay = hoursWorked * payRate;
        }
        return regularPay;
    }

    public float getOvertimeHours() {
        float hoursWorked = getHoursWorked(), hoursOver = 0.0f, payRate = getPayRate(), overTimePayRate = getPayRate() * 1.5f, overTimePay = 0.0f;
        if (hoursWorked > 40.0f) {
            hoursOver = hoursWorked - 40.0f;
            overTimePay = hoursOver * overTimePayRate;
        } else {
            return overTimePay;
        }
        return overTimePay;
    }

    public float getTotalPay() {
        float totalPay;

        totalPay = getRegularHours() + getOvertimeHours();

        return totalPay;
    }

    @Override
    public String toString() {
        return String.format("Employee Id: %d | Name: %s | Department: %s | Pay Rate : $%.2f | Hours Worked: %.2f", employeeId, name, department, payRate, hoursWorked);
    }

    public void punchIn() {
        LocalDateTime time = LocalDateTime.now();
        String formatTime = time.format(DateTimeFormatter.ofPattern("HH.mm"));
        double convertTime = Double.parseDouble(formatTime);
        punchInTime = convertTime;
    }

    public double punchIn(double time) {

        punchInTime = time;
        return punchInTime;
    }

    public void punchOut() {
        LocalDateTime time = LocalDateTime.now();
        String formatTime = time.format(DateTimeFormatter.ofPattern("HH.mm"));
        double convertTime = Double.parseDouble(formatTime);
        punchOutTime = convertTime;
    }

    public double punchOut(double time) {
        punchOutTime = time;
        return punchOutTime;
    }


    public double punchTimeCard(double punchIn, double punchOut) {
        punchInTime = punchIn;
        punchOutTime = punchOut;
        double totalHours = 0;

        totalHours = punchOutTime - punchInTime;

        this.hoursWorked += (float) totalHours;
        return totalHours;

    }


}
