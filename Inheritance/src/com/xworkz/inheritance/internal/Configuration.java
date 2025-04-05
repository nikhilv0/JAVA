package com.xworkz.inheritance.internal;

public class Configuration extends Resource{
    public Configuration() {
        super();
        System.out.println("Running constructor of Configuration class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Configuration");
    }
    public void release(){
        System.out.println("running release in Configuration");
    }
    public void getInfo(){
        System.out.println("running getInfo in Configuration");
    }
    public void refresh(){
        System.out.println("running refresh in Configuration");
    }
    public void save(){
        System.out.println("running save in Configuration");
    }
}
