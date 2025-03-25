package com.xworkz.GetterAndSetter;

public class Camera {
    private String brand;
    private int price;
    private CamType camType;
    private String connectivity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CamType getCamType() {
        return camType;
    }

    public void setCamType(CamType camType) {
        this.camType = camType;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }
}
