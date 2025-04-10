package com.xworkz.object.toString.internal;

public class Mixer {
    private String brand, model;
    private int speed;
    public Mixer(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Mixer {Brand:" + this.brand + " Model:" + this.model + " Speed:" + this.speed + "}";
    }
    @Override
    public int hashCode() {
        return 41;
    }
}
