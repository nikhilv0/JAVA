package com.xworkz.object.toString.internal;

public class EllipticalTrainer {
    private String brand, model;
    private int strideLength;
    public EllipticalTrainer(String brand, String model, int strideLength) {
        this.brand = brand;
        this.model = model;
        this.strideLength = strideLength;
    }
    @Override
    public String toString() {
        return "EllipticalTrainer {Brand:" + this.brand + " Model:" + this.model + " StrideLength:" + this.strideLength + "}";
    }
    @Override
    public int hashCode() {
        return 70;
    }
}
