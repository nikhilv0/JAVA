package com.xworkz.object.toString.internal;

public class Phone {
    String brand, model;
    double price;
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Phone {Brand: " + this.brand + ", Model: " + this.model + ", Price: $" + this.price + "}";
    }
}
