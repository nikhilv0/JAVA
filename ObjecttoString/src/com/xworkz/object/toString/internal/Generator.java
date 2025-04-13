package com.xworkz.object.toString.internal;

public class Generator {
    private String brand, fuelType;
    private int wattage;
    public Generator(String brand, String fuelType, int wattage) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.wattage = wattage;
    }
    @Override
    public String toString() {
        return "Generator {Brand:" + this.brand + " FuelType:" + this.fuelType + " Wattage:" + this.wattage + "}";
    }
    @Override
    public int hashCode() {
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Generator){
                Generator generator=this;
                Generator generator2=(Generator) obj;
                if (generator.brand.equals(generator2.brand) && generator.fuelType.equals(generator2.fuelType)){
                    return true;
                }
            }
        }
        return false;
    }
}
