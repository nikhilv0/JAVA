package com.xworkz.inheritance.internal;

public class Endpoint extends Resource{
    public Endpoint() {
        super();
        System.out.println("Running constructor of Endpoint class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Endpoint");
    }
    public void release(){
        System.out.println("running release in Endpoint");
    }
    public void getInfo(){
        System.out.println("running getInfo in Endpoint");
    }
    public void refresh(){
        System.out.println("running refresh in Endpoint");
    }
    public void save(){
        System.out.println("running save in Endpoint");
    }
}
