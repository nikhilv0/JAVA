package com.xworkz.classesAsassociation;

public class Port {
    private String type;
    private float portno;

    public Port(String type,float portno)
    {
        this.type=type;
        this.portno=portno;

    }
    public void portdisplay()
    {
        System.out.println("running port ");
        System.out.println("Type:"+this.type);
        System.out.println("Port Number:"+this.portno);
    }
}

