package com.xworkz.object.toString.internal;

public class Toaster {
    private String brand, color;
    private int slots;
    public Toaster(String brand, String color, int slots) {
        this.brand = brand;
        this.color = color;
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Toaster {Brand:" + this.brand + " Color:" + this.color + " Slots:" + this.slots + "}";
    }

    @Override
    public int hashCode() {
        return 7;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Toaster){
                Toaster toaster=this;
                Toaster toaster2=(Toaster) obj;
                if (toaster.brand.equals(toaster2.brand) && toaster.color.equals(toaster2.color) && toaster.slots==(toaster2.slots)){
                    return true;
                }
            }
        }
        return false;
    }
}
