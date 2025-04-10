package com.xworkz.object.toString.internal;

public class IceMaker {
    private String brand, model;
    private int dailyProduction;
    public IceMaker(String brand, String model, int dailyProduction) {
        this.brand = brand;
        this.model = model;
        this.dailyProduction = dailyProduction;
    }
    @Override
    public String toString() {
        return "IceMaker {Brand:" + this.brand + " Model:" + this.model + " DailyProduction:" + this.dailyProduction + "}";
    }
}
