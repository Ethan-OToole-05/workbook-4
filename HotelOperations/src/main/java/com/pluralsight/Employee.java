package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

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
        //Get the amount of hoursWorked that is NOT overtime
        return 0.0f;
    }

    public float getOvertimeHours() {
        //Get the amount of overtime hours that were over the 40 hours.
        return 0.0f;
    }

    public float getTotalPay() {
        //hours worked * payRate
        return 0.0f;
    }


}
