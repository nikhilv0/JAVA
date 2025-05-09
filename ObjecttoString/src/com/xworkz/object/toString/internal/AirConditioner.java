package com.xworkz.object.toString.internal;

public class AirConditioner {
    private String brand, type;
    private int btu;
    public AirConditioner(String brand, String type, int btu) {
        this.brand = brand;
        this.type = type;
        this.btu = btu;
    }
    @Override
    public String toString() {
        return "AirConditioner {Brand: " + this.brand + ", Type: " + this.type + ", BTU: " + this.btu + "}";
    }
    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof AirConditioner){
                AirConditioner ac=this;
                AirConditioner ac2=(AirConditioner) obj;
                if (ac.brand.equals(ac2.brand)){
                    return true;
                }

            }
        }
        return false;
    }
}
