package com.xworkz.hasasRelation;

public class Projector {
    public void displayProject() {

        Warranty warranty = new Warranty("1-1-2024", "1-1-2026");
        Lamp lamp = new Lamp(warranty);
        lamp.lampDisplay();
        System.out.println("--------------------------------------------------------");

        PortType portType=new PortType();
       Port port=new Port(portType);
       port.portDisplay();
       System.out.println("--------------------------------------------------------");

       Quality quality=new Quality();
        Wire wire=new Wire(quality);
        wire.wireDisplay();
        System.out.println("--------------------------------------------------------");


        Capacitor capacitor=new Capacitor(12,100);
        Board board=new Board(capacitor);
        board.boardDisplay();
        System.out.println("--------------------------------------------------------");


        Material material=new Material("HARD",2);
        Button button=new Button(material);
        button.buttonDisplay();
        System.out.println("--------------------------------------------------------");

        Battery battery=new Battery();
        Remote remote=new Remote(battery);
        remote.remoteDisplay();
        System.out.println("--------------------------------------------------------");


        Voltage voltage=new Voltage(1000,1000.0f);
        voltage.voltgeDisplay();
        System.out.println("--------------------------------------------------------");

    }

}
