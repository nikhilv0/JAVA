package com.xworkz.classesAsassociation;

public class Screw {
    private float length;
    private float diameter ;

    public Screw(float length,float diameter)
    {
        this.length=length;
        this.diameter=diameter;

    }
    public void screwdisplay()
    {
        System.out.println("running Remote");
        System.out.println("Length:"+this.length);
        System.out.println("Diameter:"+this.diameter);
    }
}
