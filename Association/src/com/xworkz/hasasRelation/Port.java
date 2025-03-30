package com.xworkz.hasasRelation;

public class Port {
    private PortType portType;

    public Port(PortType portType){
        this.portType=portType;
    }
    public void portDisplay(){
        if (portType!=null) {
            System.out.println("running setter");
            portType.setType("USb");
            System.out.println("Type:"+this.portType.getType());
            portType.setPortno(534);
            System.out.println("Port no:" + this.portType.getPortno());
            System.out.println("running getter");


        }
    }
}
