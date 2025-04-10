package com.xworkz.object.toString.internal;

public class IceCreamMaker {
    private String brand, type;
    private int batchSize;
    public IceCreamMaker(String brand, String type, int batchSize) {
        this.brand = brand;
        this.type = type;
        this.batchSize = batchSize;
    }
    @Override
    public String toString() {
        return "IceCreamMaker {Brand:" + this.brand + " Type:" + this.type + " BatchSize:" + this.batchSize + "}";
    }
    @Override
    public int hashCode() {
        return 57;
    }
}
