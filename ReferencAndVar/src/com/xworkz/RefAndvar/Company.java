package com.xworkz.RefAndvar;

public class Company {
    String name;
    String location;
    int employees;
    double revenue;

    Company(String name, String location, int employees, double revenue) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.revenue = revenue;
    }

    void companyMethod() {
        System.out.println("Company:");
        System.out.println("Company Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Employees: " + employees);
        System.out.println("Revenue: " + revenue + " million");
    }
}
