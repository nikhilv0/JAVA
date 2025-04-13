package com.xworkz.object.toString.internal;

public class RiceCooker {
    private String brand, type;
    private int capacity;
    public RiceCooker(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "RiceCooker {Brand:" + this.brand + " Type:" + this.type + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof RiceCooker){
                RiceCooker riceCooker=this;
                RiceCooker riceCooker2=(RiceCooker) obj;
                if (riceCooker.brand.equals(riceCooker2.brand) && riceCooker.type.equals(riceCooker2.type) && riceCooker.capacity==(riceCooker2.capacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
