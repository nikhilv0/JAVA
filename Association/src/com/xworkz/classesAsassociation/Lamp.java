package com.xworkz.classesAsassociation;

public class Lamp {
    private String material;
    private int voltage;

    public Lamp(String material,int voltage)
    {
        this.material=material;
        this.voltage=voltage;

    }
    public void lampdisplay()
    {
        System.out.println("running lamp ");
        System.out.println("Material:"+this.material);
        System.out.println("Voltage:"+this.voltage);
    }
}
