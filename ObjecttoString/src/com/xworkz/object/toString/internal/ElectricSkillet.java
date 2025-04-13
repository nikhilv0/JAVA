package com.xworkz.object.toString.internal;

public class ElectricSkillet {
    private String brand, color;
    private int temperatureRange;
    public ElectricSkillet(String brand, String color, int temperatureRange) {
        this.brand = brand;
        this.color = color;
        this.temperatureRange = temperatureRange;
    }
    @Override
    public String toString() {
        return "ElectricSkillet {Brand:" + this.brand + " Color:" + this.color + " TemperatureRange:" + this.temperatureRange + "}";
    }
    @Override
    public int hashCode() {
        return 72;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ElectricSkillet){
                ElectricSkillet skillet=this;
                ElectricSkillet skillet2=(ElectricSkillet) obj;
                if (skillet.brand.equals(skillet2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
