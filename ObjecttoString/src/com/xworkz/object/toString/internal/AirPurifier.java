package com.xworkz.object.toString.internal;

public class AirPurifier {
    private String brand, model;
    private int coverageArea;
    public AirPurifier(String brand, String model, int coverageArea) {
        this.brand = brand;
        this.model = model;
        this.coverageArea = coverageArea;
    }
    @Override
    public String toString() {
        return "AirPurifier {Brand:" + this.brand + " Model:" + this.model + " CoverageArea:" + this.coverageArea + "}";
    }
    @Override
    public int hashCode() {
        return 93;
    }
}
