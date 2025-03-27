package com.xworkz.hasasRelation;

public class Lamp {

    private Warranty warranty;

    public Lamp(Warranty warranty){
        System.out.println("running lamp");

        this.warranty=warranty;

    }

    public void lampDisplay(){
        System.out.println("accessing methods`");
        this.warranty.warrantyDisplay();


    }
}
