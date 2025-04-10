package com.xworkz.object.toString.internal;

public class RowingMachine {
    private String brand, model;
    private int maxWeightCapacity;
    public RowingMachine(String brand, String model, int maxWeightCapacity) {
        this.brand = brand;
        this.model = model;
        this.maxWeightCapacity = maxWeightCapacity;
    }
    @Override
    public String toString() {
        return "RowingMachine {Brand:" + this.brand + " Model:" + this.model + " MaxWeightCapacity:" + this.maxWeightCapacity + "}";
    }
    @Override
    public int hashCode() {
        return 28;
    }
}
