package com.xworkz.object.toString.internal;

public class StandMixer {
    private String brand, color;
    private int bowlCapacity;
    public StandMixer(String brand, String color, int bowlCapacity) {
        this.brand = brand;
        this.color = color;
        this.bowlCapacity = bowlCapacity;
    }
    @Override
    public String toString() {
        return "StandMixer {Brand:" + this.brand + " Color:" + this.color + " BowlCapacity:" + this.bowlCapacity + "}";
    }
}
