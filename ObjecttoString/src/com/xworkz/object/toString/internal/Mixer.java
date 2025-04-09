package com.xworkz.object.toString.internal;

public class Mixer {
    String brand, model;
    int speed;
    public Mixer(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Mixer {Brand:" + this.brand + " Model:" + this.model + " Speed:" + this.speed + "}";
    }
}
