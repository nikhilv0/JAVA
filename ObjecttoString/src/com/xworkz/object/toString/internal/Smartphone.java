package com.xworkz.object.toString.internal;

public class Smartphone {
    String brand, os;
    int storage;
    public Smartphone(String brand, String os, int storage) {
        this.brand = brand;
        this.os = os;
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Smartphone {Brand:" + this.brand + " OS:" + this.os + " Storage:" + this.storage + "}";
    }
}

