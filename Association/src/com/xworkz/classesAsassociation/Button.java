package com.xworkz.classesAsassociation;

public class Button {
    private String material;
    private String type ;

    public Button(String material,String type)
    {
        this.material=material;
        this.type=type;

    }
    public void buttonddisplay()
    {
        System.out.println("running button");
        System.out.println("Material:"+this.material);
        System.out.println("Type:"+this.type);
    }
}
