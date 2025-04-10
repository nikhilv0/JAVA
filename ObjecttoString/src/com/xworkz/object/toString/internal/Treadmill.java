package com.xworkz.object.toString.internal;

public class Treadmill {
    private String brand, model;
    private int maxSpeed;
    public Treadmill(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Treadmill {Brand:" + this.brand + " Model:" + this.model + " MaxSpeed:" + this.maxSpeed + "}";
    }

    @Override
    public int hashCode() {
        return 6;
    }
}
