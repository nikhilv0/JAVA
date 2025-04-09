package com.xworkz.object.toString.internal;

public class RowingMachine {
    String brand, model;
    int maxWeightCapacity;
    public RowingMachine(String brand, String model, int maxWeightCapacity) {
        this.brand = brand;
        this.model = model;
        this.maxWeightCapacity = maxWeightCapacity;
    }
    @Override
    public String toString() {
        return "RowingMachine {Brand:" + this.brand + " Model:" + this.model + " MaxWeightCapacity:" + this.maxWeightCapacity + "}";
    }
}
