package com.xworkz.object.toString.internal;

public class SlowCooker {
    private String brand, shape;
    private int capacity;
    public SlowCooker(String brand, String shape, int capacity) {
        this.brand = brand;
        this.shape = shape;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "SlowCooker {Brand:" + this.brand + " Shape:" + this.shape + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 23;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof SlowCooker){
                SlowCooker slowCooker=this;
                SlowCooker slowCooker2=(SlowCooker) obj;
                if (slowCooker.brand.equals(slowCooker2.brand) && slowCooker.shape.equals(slowCooker2.shape) && slowCooker.capacity==(slowCooker2.capacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
