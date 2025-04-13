package com.xworkz.object.toString.internal;

public class Mixer {
    private String brand, model;
    private int speed;
    public Mixer(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Mixer {Brand:" + this.brand + " Model:" + this.model + " Speed:" + this.speed + "}";
    }
    @Override
    public int hashCode() {
        return 41;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Mixer){
                Mixer mixer=this;
                Mixer mixer2=(Mixer) obj;
                if (mixer.brand.equals(mixer2.brand) && mixer.model.equals(mixer2.model)){
                    return true;
                }
            }
        }
        return false;
    }
}
