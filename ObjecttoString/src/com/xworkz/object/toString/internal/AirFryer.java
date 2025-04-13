package com.xworkz.object.toString.internal;

public class AirFryer {
    private String brand, color;
    private int capacity;
    public AirFryer(String brand, String color, int capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "AirFryer {Brand:" + this.brand + " Color:" + this.color + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof AirFryer){
                AirFryer fryer=this;
                AirFryer fryer1=(AirFryer) obj;
                if (fryer.brand.equals(fryer1.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
