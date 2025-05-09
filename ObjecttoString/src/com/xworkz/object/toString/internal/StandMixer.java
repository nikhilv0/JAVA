package com.xworkz.object.toString.internal;

public class StandMixer {
    private String brand, color;
    private int bowlCapacity;
    public StandMixer(String brand, String color, int bowlCapacity) {
        this.brand = brand;
        this.color = color;
        this.bowlCapacity = bowlCapacity;
    }
    @Override
    public String toString() {
        return "StandMixer {Brand:" + this.brand + " Color:" + this.color + " BowlCapacity:" + this.bowlCapacity + "}";
    }

    @Override
    public int hashCode() {
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof StandMixer){
                StandMixer standMixer=this;
                StandMixer standMixer2=(StandMixer) obj;
                if (standMixer.brand.equals(standMixer2.brand) && standMixer.color.equals(standMixer2.color) && standMixer.bowlCapacity==(standMixer2.bowlCapacity)){
                    return true;
                }
            }
        }
        return false;
    }
}
