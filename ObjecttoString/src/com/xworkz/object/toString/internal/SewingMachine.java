package com.xworkz.object.toString.internal;

public class SewingMachine {
    private String brand, model;
    private int stitchesPerMinute;
    public SewingMachine(String brand, String model, int stitchesPerMinute) {
        this.brand = brand;
        this.model = model;
        this.stitchesPerMinute = stitchesPerMinute;
    }
    @Override
    public String toString() {
        return "SewingMachine {Brand:" + this.brand + " Model:" + this.model + " StitchesPerMinute:" + this.stitchesPerMinute + "}";
    }
    @Override
    public int hashCode() {
        return 25;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof SewingMachine){
                SewingMachine nora=this;
                SewingMachine nora2=(SewingMachine) obj;
                if (nora.brand.equals(nora2.brand) && nora.model.equals(nora2.model) && nora.stitchesPerMinute==(nora2.stitchesPerMinute)){
                    return true;
                }
            }
        }
        return false;
    }
}
