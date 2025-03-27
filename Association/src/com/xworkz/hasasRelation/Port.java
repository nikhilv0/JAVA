package com.xworkz.hasasRelation;

public class Port {
    private PortType portType;

    public void portDisplay(){
        System.out.println("running setter");
        portType.setType("USb");
        portType.setPortno(534);
        System.out.println("running getter");
        System.out.println("Type:"+portType.getType());
        System.out.println("Port no:"+portType.getPortno());
    }
}
