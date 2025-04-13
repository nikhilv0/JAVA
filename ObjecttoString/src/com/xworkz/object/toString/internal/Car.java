package com.xworkz.object.toString.internal;

public class Car {
    private String brand, model;
    private int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car {Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year + "}";
    }
    @Override
    public int hashCode() {
        return 86;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Car){
                Car car=this;
                Car car2=(Car) obj;
                if (car.brand.equals(car2.brand)){
                    return true;
                }
            }
        }
        return false;
    }
}
