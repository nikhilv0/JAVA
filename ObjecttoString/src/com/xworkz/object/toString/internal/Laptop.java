package com.xworkz.object.toString.internal;

public class Laptop {
    private String processor, brand;
    private int ram;
    public Laptop(String processor, String brand, int ram) {
        this.processor = processor;
        this.brand = brand;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Laptop {Processor: " + this.processor + ", Brand: " + this.brand + ", RAM: " + this.ram + "GB}";
    }
    @Override
    public int hashCode() {
        return 49;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Laptop){
                Laptop laptop=this;
                Laptop laptop2=(Laptop) obj;
                if (laptop.brand.equals(laptop2.brand) && laptop.processor.equals(laptop2.processor)){
                    return true;
                }
            }
        }
        return false;
    }
}
