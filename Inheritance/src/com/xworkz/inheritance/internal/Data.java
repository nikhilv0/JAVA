package com.xworkz.inheritance.internal;

public class Data extends Resource{
    public Data() {
        super();
        System.out.println("Running constructor of Data class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Data");
    }
    public void release(){
        System.out.println("running release in Data");
    }
    public void getInfo(){
        System.out.println("running getInfo in Data");
    }
    public void refresh(){
        System.out.println("running refresh in Data");
    }
    public void save(){
        System.out.println("running save in Data");
    }
}
