package com.xworkz.object.toString.internal;

public class ElectricGrill {
    private String brand, model;
    private int power;
    public ElectricGrill(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }
    @Override
    public String toString() {
        return "ElectricGrill {Brand:" + this.brand + " Model:" + this.model + " Power:" + this.power + "}";
    }
    @Override
    public int hashCode() {
        return 74;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof ElectricGrill){
                ElectricGrill grill=this;
                ElectricGrill grill2=(ElectricGrill) obj;
                if (grill.brand.equals(grill2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
