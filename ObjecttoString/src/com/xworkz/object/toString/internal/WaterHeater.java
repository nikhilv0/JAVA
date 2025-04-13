package com.xworkz.object.toString.internal;

public class WaterHeater {
    private String brand, type;
    private int liters;
    public WaterHeater(String brand, String type, int liters) {
        this.brand = brand;
        this.type = type;
        this.liters = liters;
    }
    @Override
    public String toString() {
        return "WaterHeater {Brand:" + this.brand + " Type:" + this.type + " Liters:" + this.liters + "}";
    }

    @Override
    public int hashCode() {
        return 3;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof WaterHeater){
                WaterHeater waterHeater=this;
                WaterHeater waterHeater2=(WaterHeater) obj;
                if (waterHeater.brand.equals(waterHeater2.brand) && waterHeater.type==(waterHeater2.type) && waterHeater.liters==(waterHeater2.liters)){
                    return true;
                }
            }
        }
        return false;
    }
}
