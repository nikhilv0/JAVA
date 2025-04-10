package com.xworkz.object.toString.internal;

public class Webcam {
    private String brand, resolution;
    private boolean hasMic;
    public Webcam(String brand, String resolution, boolean hasMic) {
        this.brand = brand;
        this.resolution = resolution;
        this.hasMic = hasMic;
    }
    @Override
    public String toString() {
        return "Webcam {Brand:" + this.brand + " Resolution:" + this.resolution + " HasMic:" + this.hasMic + "}";
    }

    @Override
    public int hashCode() {
//        System.out.println("Webcam:"+super.hashCode());
        return 1;
    }
}
