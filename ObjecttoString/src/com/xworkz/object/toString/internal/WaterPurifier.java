package com.xworkz.object.toString.internal;

public class WaterPurifier {
    private String brand, method;
    private int capacity;
    public WaterPurifier(String brand, String method, int capacity) {
        this.brand = brand;
        this.method = method;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "WaterPurifier {Brand:" + this.brand + " Method:" + this.method + " Capacity:" + this.capacity + "}";
    }

    @Override
    public int hashCode() {
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof WaterPurifier){
                WaterPurifier waterPurifier=this;
                WaterPurifier waterPurifier2=(WaterPurifier) obj;
                if (waterPurifier.brand.equals(waterPurifier.brand) && waterPurifier.brand.equals(waterPurifier.brand) && waterPurifier.capacity==(waterPurifier.capacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
