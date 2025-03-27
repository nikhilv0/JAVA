package com.xworkz.classesAsassociation;

public class Panel {
    private int size;
    private boolean soundproofing ;

    public Panel(int size,boolean soundproofing)
    {
        this.size=size;
        this.soundproofing=soundproofing;

    }
    public void Paneldisplay()
    {
        System.out.println("running panel");
        System.out.println("Size:"+this.size);
        System.out.println("Sound proofing:"+this.soundproofing);
    }
}
