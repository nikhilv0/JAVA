package com.xworkz.hasasRelation;

public class Material {
    private String type;
    private int quantity;


    public Material(String type,int quantity){
        System.out.println("running material const");
        this.type=type;
        this.quantity=quantity;

    }
    public void materialDisplay(){
        System.out.println("Type:"+this.type);
        System.out.println("Quantity:"+this.quantity);

    }
}
