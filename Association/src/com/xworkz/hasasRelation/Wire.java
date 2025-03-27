package com.xworkz.hasasRelation;

public class Wire {
    private Quality quality;

    public void wireDisplay(){
        System.out.println("running setter");
        quality.setType("HD");
        quality.setPixel(200);
        System.out.println("running getter");
        System.out.println("Type:"+quality.getType());
        System.out.println("Pixels:"+quality.getPixel());
    }
}
