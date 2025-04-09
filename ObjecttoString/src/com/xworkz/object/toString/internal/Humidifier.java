package com.xworkz.object.toString.internal;

public class Humidifier {
    String brand, type;
    int tankSize;
    public Humidifier(String brand, String type, int tankSize) {
        this.brand = brand;
        this.type = type;
        this.tankSize = tankSize;
    }
    @Override
    public String toString() {
        return "Humidifier {Brand:" + this.brand + " Type:" + this.type + " TankSize:" + this.tankSize + "}";
    }
}
