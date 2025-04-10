package com.xworkz.object.toString.internal;

public class PopcornMaker {
    private String brand, style;
    private int batchSize;
    public PopcornMaker(String brand, String style, int batchSize) {
        this.brand = brand;
        this.style = style;
        this.batchSize = batchSize;
    }
    @Override
    public String toString() {
        return "PopcornMaker {Brand:" + this.brand + " Style:" + this.style + " BatchSize:" + this.batchSize + "}";
    }
}
