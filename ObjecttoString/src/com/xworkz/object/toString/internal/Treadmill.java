package com.xworkz.object.toString.internal;

public class Treadmill {
    private String brand, model;
    private int maxSpeed;
    public Treadmill(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Treadmill {Brand:" + this.brand + " Model:" + this.model + " MaxSpeed:" + this.maxSpeed + "}";
    }

    @Override
    public int hashCode() {
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Treadmill){
                Treadmill treadMill=this;
                Treadmill treadMill2=(Treadmill) obj;
                if (treadMill.brand.equals(treadMill2.brand) && treadMill.model.equals(treadMill2.model) && treadMill.maxSpeed==(treadMill2.maxSpeed)){
                    return true;
                }
            }
        }
        return false;
    }
}
