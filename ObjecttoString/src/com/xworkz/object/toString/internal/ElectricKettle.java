package com.xworkz.object.toString.internal;

public class ElectricKettle {
    private String brand, material;
    private int capacity;
    public ElectricKettle(String brand, String material, int capacity) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "ElectricKettle {Brand:" + this.brand + " Material:" + this.material + " Capacity:" + this.capacity + "}";
    }
    @Override
    public int hashCode() {
        return 73;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ElectricKettle){
                ElectricKettle Ekettle=this;
                ElectricKettle Ekette2=(ElectricKettle) obj;
                if (Ekettle.brand.equals(Ekette2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
