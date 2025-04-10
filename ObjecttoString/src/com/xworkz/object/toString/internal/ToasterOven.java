package com.xworkz.object.toString.internal;

public class ToasterOven {
    private String brand, type;
    private int temperatureRange;
    public ToasterOven(String brand, String type, int temperatureRange) {
        this.brand = brand;
        this.type = type;
        this.temperatureRange = temperatureRange;
    }
    @Override
    public String toString() {
        return "ToasterOven {Brand:" + this.brand + " Type:" + this.type + " TemperatureRange:" + this.temperatureRange + "}";
    }
}
