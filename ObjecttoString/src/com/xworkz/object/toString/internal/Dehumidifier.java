package com.xworkz.object.toString.internal;

public class Dehumidifier {
    private String brand, model;
    private int capacity;
    public Dehumidifier(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Dehumidifier {Brand:" + this.brand + " Model:" + this.model + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 78;
    }
}
