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
    @Override
    public int hashCode() {
        return 35;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof PopcornMaker){
                PopcornMaker popcornMaker=this;
                PopcornMaker popcornMaker2=(PopcornMaker) obj;
                if (popcornMaker.brand.equals(popcornMaker2.brand) && popcornMaker.style.equals(popcornMaker2.style) && popcornMaker.batchSize==(popcornMaker2.batchSize)){
                    return true;
                }
            }
        }
        return false;
    }
}
