package com.xworkz.object.toString.internal;

public class PressureCooker {
    private String brand, color;
    private int psi;

    public PressureCooker(String brand, String color, int psi) {
        this.brand = brand;
        this.color = color;
        this.psi = psi;
    }

    @Override
    public String toString() {
        return "PressureCooker {Brand:" + this.brand + " Color:" + this.color + " PSI:" + this.psi + "}";
    }
}
