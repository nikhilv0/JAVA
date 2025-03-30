package com.xworkz.classesAsassociation;

public class Projector {
     public void projectDisplay(){
    Len len=new Len();
    len.setBrand("canon");
    System.out.println("Brand:"+len.getBrand());
    len.setSize(10);
    System.out.println("Size:"+len.getSize());
    System.out.println("--------------------------------------------");

    Lamp lamp=new Lamp();
    lamp.setMaterial("Glass");
    System.out.println("Material:"+lamp.getMaterial());
    lamp.setVoltage(5);
    System.out.println("Voltage:"+lamp.getVoltage());
    System.out.println("--------------------------------------------");

    Button button=new Button();
    button.setMaterial("Metal");
    System.out.println("Material:"+button.getMaterial());
    button.setType("Push BUtton");
    System.out.println("Type:"+button.getType());
    System.out.println("--------------------------------------------");


    Port port=new Port();
    port.setPortno(455.4f);
    System.out.println("Port Number:"+port.getPortno());
    port.setType("USB");
    System.out.println("Type:"+port.getType());
    System.out.println("--------------------------------------------");

    Wire wire=new Wire();
    wire.setType("Twisted pair");
    System.out.println("Type:"+wire.getType());
    wire.setConductivity("true");
    System.out.println("Conductivity:"+wire.getConductivity());
    System.out.println("--------------------------------------------");

    Board board=new Board();
    board.setSurface("Rough");
    System.out.println("Surface:"+board.getSurface());
    board.setThickness("1.66mm");
    System.out.println("Thickness:"+board.getThickness());
    System.out.println("--------------------------------------------");

    Panel panel=new Panel();
    panel.setSize(2);
    System.out.println("Size:"+panel.getSize());
    panel.setSoundproofing("True");
    System.out.println("Sound Proofing:"+panel.getSoundproofing());
    System.out.println("--------------------------------------------");

    Remote remote=new Remote();
    remote.setAccessControl("100");
    System.out.println("Access Control:"+remote.getAccessControl());
    remote.setSignalRange(100);
    System.out.println("Signal Range::"+remote.getSignalRange());
    System.out.println("--------------------------------------------");

    Screw screw=new Screw();
    screw.setLength(2);
    System.out.println("Length:"+screw.getLength());
    screw.setDiameter(2.3f);
    System.out.println("Diameter:"+screw.getDiameter());
    System.out.println("--------------------------------------------");

     }
}
