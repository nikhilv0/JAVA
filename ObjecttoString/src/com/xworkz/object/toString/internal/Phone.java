package com.xworkz.object.toString.internal;

public class Phone {
    private String brand, model;
    private double price;
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Phone {Brand: " + this.brand + ", Model: " + this.model + ", Price: $" + this.price + "}";
    }
    @Override
    public int hashCode() {
        return 36;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Phone){
                Phone phone=this;
                Phone phone2=(Phone) obj;
                if (phone.brand.equals(phone2.brand) && phone.model.equals(phone2.model) && phone.price==(phone2.price)){
                    return true;
                }
            }
        }
        return false;
    }
}
