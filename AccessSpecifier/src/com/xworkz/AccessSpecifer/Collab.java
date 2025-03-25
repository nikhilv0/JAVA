package com.xworkz.AccessSpecifer;

import sun.swing.plaf.synth.Paint9Painter;

public class Collab {
    Pant pant;

    public Collab(Pant pant){
        this.pant=pant;

    }
    public void displaycollob(){
        this.pant.measurement();
        System.out.println("Measurements:"+this.pant.size);
    }
}
