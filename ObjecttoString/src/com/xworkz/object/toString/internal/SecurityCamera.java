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
    @Override
    public int hashCode() {
        return 26;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof SecurityCamera){
                SecurityCamera securityCamera=this;
                SecurityCamera securityCamera2=(SecurityCamera) obj;
                if (securityCamera.brand.equals(securityCamera2.brand) && securityCamera.resolution.equals(securityCamera2.resolution) && securityCamera.fieldOfView==(securityCamera2.fieldOfView)){
                    return true;
                }
            }
        }
        return false;
    }
}
