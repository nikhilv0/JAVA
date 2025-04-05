package com.xworkz.inheritance.internal;

public class Service extends Resource{
    public Service() {
        super();
        System.out.println("Running constructor of Service class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Service");
    }
    public void release(){
        System.out.println("running release in Service");
    }
    public void getInfo(){
        System.out.println("running getInfo in Service");
    }
    public void refresh(){
        System.out.println("running refresh in Service");
    }
    public void save(){
        System.out.println("running save in Service");
    }
}
