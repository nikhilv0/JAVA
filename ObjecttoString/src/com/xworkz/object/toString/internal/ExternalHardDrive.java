package com.xworkz.object.toString.internal;

public class ExternalHardDrive {
    private String brand, type;
    private int capacity;
    public ExternalHardDrive(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "ExternalHardDrive {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 67;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ExternalHardDrive){
                ExternalHardDrive hardDrive=this;
                ExternalHardDrive hardDrive2=(ExternalHardDrive) obj;
                if (hardDrive.brand.equals(hardDrive2.brand) && hardDrive.type.equals(hardDrive2.type)){
                    return true;
                }
            }
        }
        return false;
    }
}
