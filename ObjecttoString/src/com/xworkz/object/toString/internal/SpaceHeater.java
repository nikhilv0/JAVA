package com.xworkz.object.toString.internal;

public class SpaceHeater {
    private String brand, type;
    private int heatOutput;
    public SpaceHeater(String brand, String type, int heatOutput) {
        this.brand = brand;
        this.type = type;
        this.heatOutput = heatOutput;
    }
    @Override
    public String toString() {
        return "SpaceHeater {Brand:" + this.brand + " Type:" + this.type + " HeatOutput:" + this.heatOutput + "}";
    }
    @Override
    public int hashCode() {
        return 16;
    }
}
