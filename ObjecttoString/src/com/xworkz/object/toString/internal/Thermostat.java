package com.xworkz.object.toString.internal;

public class Thermostat {
    private String brand, mode;
    private int temperature;
    public Thermostat(String brand, String mode, int temperature) {
        this.brand = brand;
        this.mode = mode;
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Thermostat {Brand:" + this.brand + " Mode:" + this.mode + " Temperature:" + this.temperature + "}";
    }
}
