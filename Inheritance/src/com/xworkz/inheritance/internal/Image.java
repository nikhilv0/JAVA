package com.xworkz.inheritance.internal;

public class Image extends Resource{
    public Image() {
        super();
        System.out.println("Running constructor of Image class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Image");
    }
    public void release(){
        System.out.println("running release in Image");
    }
    public void getInfo(){
        System.out.println("running getInfo in Image");
    }
    public void refresh(){
        System.out.println("running refresh in Image");
    }
    public void save(){
        System.out.println("running save in Image");
    }
}
