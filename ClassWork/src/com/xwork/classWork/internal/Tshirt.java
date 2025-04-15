package com.xwork.classWork.internal;

public class Tshirt {
    private String color;
    private String brand;
    private int size;

    public Tshirt(){
        System.out.println("running const tshirt");

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
        if (!(o instanceof Tshirt)) {
            Tshirt tshirt1 = this;
            Tshirt tshirt2 = (Tshirt) o;
            if (tshirt1.size==tshirt2.size && tshirt1.brand.equals(tshirt2.brand) && tshirt1.color.equals(tshirt2.color)) {
                System.out.println("sme");
                return true;
            }
        }
    }
        return true;
    }

}
