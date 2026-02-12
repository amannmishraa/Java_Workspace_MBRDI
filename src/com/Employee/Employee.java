package com.Employee;
public class Employee {

    private int id;
    private String name;
    private double salary;
    private String designation;
    private int leavesTaken;

    private static final int TOTAL_LEAVES = 32;
    private static final int WORKING_DAYS = 365;

    public Employee(int id, String name, double salary, String designation, int leavesTaken) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.leavesTaken = leavesTaken;
    }

    public double calculateSalary() {

        double updatedSalary = salary;

        // Increment based on designation
        if (designation.equalsIgnoreCase("programmer")) {
            updatedSalary += salary * 0.10;  // 10% increment
        }
        else if (designation.equalsIgnoreCase("designer")) {
            updatedSalary += salary * 0.20;  // 20% increment
        }

        // Leave deduction (pro-rata basis)
        if (leavesTaken > TOTAL_LEAVES) {
            int extraLeaves = leavesTaken - TOTAL_LEAVES;

            // Per day salary
            double perDaySalary = updatedSalary / WORKING_DAYS;

            // Deduction amount
            double deduction = perDaySalary * extraLeaves;

            updatedSalary -= deduction;
        }

        return updatedSalary;
    }

    // Getters (for testing if needed)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}
