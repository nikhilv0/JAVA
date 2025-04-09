package com.xworkz.object.toString.internal;

public class Clock {
    private String brand, type;
    private boolean isDigital;
    public Clock(String brand, String type, boolean isDigital) {
        this.brand = brand;
        this.type = type;
        this.isDigital = isDigital;
    }
    @Override
    public String toString() {
        return "Clock {Brand:" + this.brand + " Type:" + this.type + " Digital:" + this.isDigital + "}";
    }
}
