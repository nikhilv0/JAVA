package com.xworkz.object.toString.internal;

public class Projector {
    private String brand, resolution;
    private int lumens;
    public Projector(String brand, String resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }
    @Override
    public String toString() {
        return "Projector {Brand:" + this.brand + " Resolution:" + this.resolution + " Lumens:" + this.lumens + "}";
    }
    @Override
    public int hashCode() {
        return 33;
    }@Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Projector){
                Projector projector=this;
                Projector projector2=(Projector) obj;
                if (projector.brand.equals(projector2.brand) && projector.resolution.equals(projector2.resolution) && projector.lumens==(projector2.lumens)){
                    return true;
                }
            }
        }
        return false;
    }
}
