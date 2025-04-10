package com.xworkz.object.toString.internal;

public class SecurityCamera {
    private String brand, resolution;
    private int fieldOfView;
    public SecurityCamera(String brand, String resolution, int fieldOfView) {
        this.brand = brand;
        this.resolution = resolution;
        this.fieldOfView = fieldOfView;
    }
    @Override
    public String toString() {
        return "SecurityCamera {Brand:" + this.brand + " Resolution:" + this.resolution + " FieldOfView:" + this.fieldOfView + "}";
    }
}
