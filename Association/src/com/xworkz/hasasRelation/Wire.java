package com.xworkz.hasasRelation;

public class Wire {
    private Quality quality;

    public Wire(Quality quality){
        this.quality=quality;
    }

    public void wireDisplay(){
        if(quality!=null) {
            System.out.println("running setter");
            quality.setType("HD");
            quality.setPixel(200);
            System.out.println("running getter");
            System.out.println("Type:" + quality.getType());
            System.out.println("Pixels:" + quality.getPixel());
        }
    }
}
