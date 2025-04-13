package com.xworkz.object.toString.internal;

public class FlashDrive {
    private String brand, type;
    private int capacity;
    public FlashDrive(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "FlashDrive {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 65;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof FlashDrive){
                FlashDrive flashDrive=this;
                FlashDrive flashDrive2=(FlashDrive) obj;
                if (flashDrive.brand.equals(flashDrive2.brand) && flashDrive.type.equals(flashDrive2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
