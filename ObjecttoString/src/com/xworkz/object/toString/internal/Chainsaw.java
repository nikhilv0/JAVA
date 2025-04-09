package com.xworkz.object.toString.internal;

public class Chainsaw {
    private String brand, model;
    private int barLength;
    public Chainsaw(String brand, String model, int barLength) {
        this.brand = brand;
        this.model = model;
        this.barLength = barLength;
    }
    @Override
    public String toString() {
        return "Chainsaw {Brand:" + this.brand + " Model:" + this.model + " BarLength:" + this.barLength + "}";
    }
}
