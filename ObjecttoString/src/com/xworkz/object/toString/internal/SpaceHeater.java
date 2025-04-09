package com.xworkz.object.toString.internal;

public class SpaceHeater {
    String brand, type;
    int heatOutput;
    public SpaceHeater(String brand, String type, int heatOutput) {
        this.brand = brand;
        this.type = type;
        this.heatOutput = heatOutput;
    }
    @Override
    public String toString() {
        return "SpaceHeater {Brand:" + this.brand + " Type:" + this.type + " HeatOutput:" + this.heatOutput + "}";
    }
}
