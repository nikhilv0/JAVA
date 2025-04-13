package com.xworkz.object.toString.internal;

public class Refrigerator {
    private String brand, type;
    private int capacity;
    public Refrigerator(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Refrigerator {Brand: " + this.brand + ", Type: " + this.type + ", Capacity: " + this.capacity + " liters}";
    }
    @Override
    public int hashCode() {
        return 32;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Refrigerator){
                Refrigerator refrigertor=this;
                Refrigerator refrigertor2=(Refrigerator) obj;
                if (refrigertor.brand.equals(refrigertor2.brand) && refrigertor.type.equals(refrigertor2.type) && refrigertor.capacity==(refrigertor2.capacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
