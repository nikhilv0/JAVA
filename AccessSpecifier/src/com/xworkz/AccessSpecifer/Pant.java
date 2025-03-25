package com.xworkz.AccessSpecifer;

public class Pant {
    public String brand;
    private float cost;
    int size;

    private void cost(){
        System.out.println("Cost:"+cost);
    }
    void measurement(){
        System.out.println("Measurement:"+this.size);
    }
    public void displayBrand(){
        cost();
    }
}

