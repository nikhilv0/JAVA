package com.xworkz.object.toString.internal;

public class SnowBlower {
    String brand, model;
    int clearingWidth;
    public SnowBlower(String brand, String model, int clearingWidth) {
        this.brand = brand;
        this.model = model;
        this.clearingWidth = clearingWidth;
    }
    @Override
    public String toString() {
        return "SnowBlower {Brand:" + this.brand + " Model:" + this.model + " ClearingWidth:" + this.clearingWidth + "}";
    }
}
