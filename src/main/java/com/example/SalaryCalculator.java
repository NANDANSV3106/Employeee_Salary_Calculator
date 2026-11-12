package com.example;

import java.util.Scanner;

public class SalaryCalculator {

    public static Object calculateHRA(double basic) {
        if (basic <= 0) return "Invalid salary";
        return basic * 0.20; 
    }

    public static Object calculateDA(double basic) {
        if (basic <= 0) return "Invalid salary";
        return basic * 0.50; 
    }

    public static Object calculateDeductions(double basic) {
        if (basic <= 0) return "Invalid salary";
        return basic * 0.12; 
    }

    public static Object calculateGrossSalary(double basic) {
        if (basic <= 0) return "Invalid salary";
        return basic + (double) calculateHRA(basic) + (double) calculateDA(basic);
    }

    public static Object calculateNetSalary(double basic) {
        if (basic <= 0) return "Invalid salary";
        return (double) calculateGrossSalary(basic) - (double) calculateDeductions(basic);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.println("HRA          : " + calculateHRA(basic));
        System.out.println("DA           : " + calculateDA(basic));
        System.out.println("Gross Salary : " + calculateGrossSalary(basic));
        System.out.println("Deductions   : " + calculateDeductions(basic));
        System.out.println("Net Salary   : " + calculateNetSalary(basic));

        sc.close();
    }
}
