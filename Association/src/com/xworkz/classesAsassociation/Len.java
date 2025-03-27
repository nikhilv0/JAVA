package com.xworkz.classesAsassociation;

public class Len {
    private String brand;
    private int size;

    public Len(String brand,int size){
        this.brand=brand;
        this.size=size;
    }
    public void DisplayLen(){
        System.out.println("running len");
        System.out.println("Brand:"+this.brand);
        System.out.println("Size:"+this.size);

    }

}
