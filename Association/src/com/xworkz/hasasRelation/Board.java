package com.xworkz.hasasRelation;

public class Board {
    private Capacitor capacitor;

    public Board(Capacitor capacitor){
        System.out.println("running borad const");
        this.capacitor=capacitor;
    }

    public void boardDisplay(){
        System.out.println("accessing capacitor");
        this.capacitor.capacitorDisplay();
    }
}
