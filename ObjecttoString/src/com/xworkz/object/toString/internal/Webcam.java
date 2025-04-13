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
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Webcam){
                Webcam webcam=this;
                Webcam webcam2=(Webcam) obj;
                if (webcam.brand.equals(webcam2.brand) && webcam.hasMic==(webcam2.hasMic) && webcam.resolution.equals(webcam2.resolution)){
                    return true;
                }
            }
        }
        return false;
    }
}
