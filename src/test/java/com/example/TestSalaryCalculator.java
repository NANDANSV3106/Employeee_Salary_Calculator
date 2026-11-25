package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSalaryCalculator {
    @Test
    public void testHraAndDaCalculations() {
        double basic = 10000;
        assertEquals(2000.0, SalaryCalculator.calculateHRA(basic));
        assertEquals(5000.0, SalaryCalculator.calculateDA(basic));
    }
    @Test
    public void testGrossSalaryCalculation() {
        assertEquals(17000.0, SalaryCalculator.calculateGrossSalary(10000));
    }
    @Test
    public void testDeductionCalculation() {
        assertEquals(1200.0, SalaryCalculator.calculateDeductions(10000));
    }
    @Test
    public void testNetSalaryCalculation() {
        assertEquals(15800.0, SalaryCalculator.calculateNetSalary(10000));
    }
    @Test
    public void testBoundaryAndInvalidSalaryValues() {
        assertEquals(1.58, (double) SalaryCalculator.calculateNetSalary(1.0), 0.01);

        assertEquals("Invalid salary", SalaryCalculator.calculateHRA(0));
        assertEquals("Invalid salary", SalaryCalculator.calculateDA(0));
        assertEquals("Invalid salary", SalaryCalculator.calculateDeductions(0));
        assertEquals("Invalid salary", SalaryCalculator.calculateGrossSalary(0));
        assertEquals("Invalid salary", SalaryCalculator.calculateNetSalary(0));
        assertEquals("Invalid salary", SalaryCalculator.calculateNetSalary(-5000));
    }
}
