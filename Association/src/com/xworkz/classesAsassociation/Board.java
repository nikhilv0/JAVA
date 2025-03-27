package com.xworkz.classesAsassociation;

public class Board {
    private String thickness;
    private String surface ;

    public Board(String thickness,String surface)
    {
        this.thickness=thickness;
        this.surface=surface;

    }
    public void boarddisplay()
    {
        System.out.println("running board ");
        System.out.println("Thickness:"+this.thickness);
        System.out.println("Surface:"+this.surface);
    }
}
