package com.xworkz.object.toString.internal;

public class Monitor {
    private String brand, resolution;
    private int size;
    public Monitor(String brand, String resolution, int size) {
        this.brand = brand;
        this.resolution = resolution;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Monitor {Brand:" + this.brand + " Resolution:" + this.resolution + " Size:" + this.size + "}";
    }
    @Override
    public int hashCode() {
        return 40;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Monitor){
                Monitor monitor=this;
                Monitor monitor2=(Monitor) obj;
                if (monitor.brand.equals(monitor2.brand) && monitor.resolution.equals(monitor2.resolution)){
                    return true;
                }
            }
        }
        return false;
    }
}
