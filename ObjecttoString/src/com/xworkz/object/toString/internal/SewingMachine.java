package com.xworkz.object.toString.internal;

public class SewingMachine {
    String brand, model;
    int stitchesPerMinute;
    public SewingMachine(String brand, String model, int stitchesPerMinute) {
        this.brand = brand;
        this.model = model;
        this.stitchesPerMinute = stitchesPerMinute;
    }
    @Override
    public String toString() {
        return "SewingMachine {Brand:" + this.brand + " Model:" + this.model + " StitchesPerMinute:" + this.stitchesPerMinute + "}";
    }
}
