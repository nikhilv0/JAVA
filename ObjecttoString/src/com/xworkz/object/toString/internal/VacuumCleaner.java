package com.xworkz.object.toString.internal;

public class VacuumCleaner {
    String brand, model;
    int suctionPower;
    public VacuumCleaner(String brand, String model, int suctionPower) {
        this.brand = brand;
        this.model = model;
        this.suctionPower = suctionPower;
    }
    @Override
    public String toString() {
        return "VacuumCleaner {Brand:" + this.brand + " Model:" + this.model + " SuctionPower:" + this.suctionPower + "}";
    }
}
