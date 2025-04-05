package com.xworkz.inheritance.internal;

public class Memory extends Resource{
    public Memory() {
        super();
        System.out.println("Running constructor of Memory class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Memory");
    }
    public void release(){
        System.out.println("running release in Memory");
    }
    public void getInfo(){
        System.out.println("running getInfo in Memory");
    }
    public void refresh(){
        System.out.println("running refresh in Memory");
    }
    public void save(){
        System.out.println("running save in Memory");
    }
}
