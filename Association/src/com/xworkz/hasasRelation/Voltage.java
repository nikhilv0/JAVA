package com.xworkz.hasasRelation;

public class Voltage {
    private int power;
    private float capacity;

    public Voltage(int power,float capacity){
        System.out.println("running voltage conts");
        this.power=power;
        this.capacity=capacity;
    }

    public void voltgeDisplay(){
        System.out.println("Power:"+this.power);
        System.out.println("Capacity:"+this.capacity);
    }
}
