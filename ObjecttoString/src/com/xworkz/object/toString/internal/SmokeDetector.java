package com.xworkz.object.toString.internal;

public class SmokeDetector {
    String brand, type;
    int sensitivityLevel;
    public SmokeDetector(String brand, String type, int sensitivityLevel) {
        this.brand = brand;
        this.type = type;
        this.sensitivityLevel = sensitivityLevel;
    }
    @Override
    public String toString() {
        return "SmokeDetector {Brand:" + this.brand + " Type:" + this.type + " SensitivityLevel:" + this.sensitivityLevel + "}";
    }
}
