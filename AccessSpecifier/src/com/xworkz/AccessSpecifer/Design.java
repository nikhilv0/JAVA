package com.xworkz.AccessSpecifer;

public class Design {
    Frame frame;

    public Design(Frame frame){
        this.frame=frame;
    }
    public void designDis(){
        this.frame.price();
        System.out.println("Cost:"+this.frame.cost);
    }
}
