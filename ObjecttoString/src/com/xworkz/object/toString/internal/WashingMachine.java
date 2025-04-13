package com.xworkz.object.toString.internal;

public class WashingMachine {
    private String brand, model;
    private double capacity;
    public WashingMachine(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "WashingMachine {Brand: " + this.brand + ", Model: " + this.model + ", Capacity: " + this.capacity + " kg}";
    }

    @Override
    public int hashCode() {
        return 4;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof WashingMachine){
                WashingMachine washingMachine=this;
                WashingMachine washingMachine2=(WashingMachine) obj;
                if (washingMachine.brand.equals(washingMachine2.brand) && washingMachine.model.equals(washingMachine2.model) && washingMachine.capacity==(washingMachine2.capacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
