package com.xworkz.object.toString.internal;

public class Treadmill {
    String brand, model;
    int maxSpeed;
    public Treadmill(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Treadmill {Brand:" + this.brand + " Model:" + this.model + " MaxSpeed:" + this.maxSpeed + "}";
    }
}
