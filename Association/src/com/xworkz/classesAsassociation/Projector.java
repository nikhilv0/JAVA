package com.xworkz.classesAsassociation;

public class Projector {
     public void projectDisplay(){
    Len len=new Len("Canano",2);
    len.DisplayLen();
         System.out.println("--------------------------------------------");
    Lamp lamp=new Lamp("glass",5);
    lamp.lampdisplay();
         System.out.println("--------------------------------------------");
    Port port=new Port("USB",443);
    port.portdisplay();
         System.out.println("--------------------------------------------");
    Wire wire=new Wire("Twisted pair",true);
    wire.wiredisplay();
         System.out.println("--------------------------------------------");
    Board board=new Board("1.6mm","Rough");
    board.boarddisplay();
    System.out.println("--------------------------------------------");
    Button button=new Button("Metal","Push button");
    button.buttonddisplay();
         System.out.println("--------------------------------------------");
    Panel panel=new Panel(2,true);
    panel.Paneldisplay();
         System.out.println("--------------------------------------------");
    Remote remote=new Remote(100,"yes");
    remote.remotedisplay();
         System.out.println("--------------------------------------------");
    Screw screw=new Screw(2.3f,1);
    screw.screwdisplay();
         System.out.println("--------------------------------------------");
     }
}
