package com.xworkz.object.toString.internal;

public class CoffeeGrinder {
    private String brand, type;
    private int grindSettings;
    public CoffeeGrinder(String brand, String type, int grindSettings) {
        this.brand = brand;
        this.type = type;
        this.grindSettings = grindSettings;
    }
    @Override
    public String toString() {
        return "CoffeeGrinder {Brand:" + this.brand + " Type:" + this.type + " GrindSettings:" + this.grindSettings + "}";
    }
    @Override
    public int hashCode() {
        return 81;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof CoffeeGrinder){
                CoffeeGrinder grinder=this;
                CoffeeGrinder grinder2=(CoffeeGrinder) obj;
                if (grinder.brand.equals(grinder2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
