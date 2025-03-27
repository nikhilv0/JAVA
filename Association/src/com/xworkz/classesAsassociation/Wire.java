package com.xworkz.classesAsassociation;

public class Wire {
    private String type;
    private boolean conductivity;

    public Wire(String type,boolean conductivit)
    {
        this.type=type;
        this.conductivity=conductivit;

    }
    public void wiredisplay()
    {
        System.out.println("running wire ");
        System.out.println("Type:"+this.type);
        System.out.println("Conductivity:"+this.conductivity);
    }
}
