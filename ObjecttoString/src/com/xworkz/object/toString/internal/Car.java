package com.xworkz.object.toString.internal;

public class Car {
    private String brand, model;
    private int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car {Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year + "}";
    }
    @Override
    public int hashCode() {
        return 86;
    }
}
