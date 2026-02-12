package com.Employee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployee {

    @Test
    public void testProgrammerSalary() {
        Employee emp = new Employee(1, "ABC", 100000, "programmer", 30);

        // 10% increment = 110000
        double expected = 110000;

        assertEquals(expected, emp.calculateSalary(), 0.01);
    }

    @Test
    public void testDesignerSalary() {
        Employee emp = new Employee(2, "XYZ", 100000, "designer", 30);

        // 20% increment = 120000
        double expected = 120000;

        assertEquals(expected, emp.calculateSalary(), 0.01);
    }

    @Test
    public void testLeaveDeduction() {
        Employee emp = new Employee(3, "Sam", 100000, "programmer", 40);

        // 10% increment = 110000
        // Extra leaves = 40 - 32 = 8
        // Per day salary = 110000 / 365
        double incrementedSalary = 110000;
        double deduction = (incrementedSalary / 365) * 8;
        double expected = incrementedSalary - deduction;

        assertEquals(expected, emp.calculateSalary(), 0.01);
    }
}

