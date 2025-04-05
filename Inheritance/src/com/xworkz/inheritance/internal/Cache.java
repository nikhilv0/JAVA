package com.xworkz.inheritance.internal;

public class Cache extends Resource{
    public Cache() {
        super();
        System.out.println("Running constructor of Cache class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Cache");
    }
    public void release(){
        System.out.println("running release in Cache");
    }
    public void getInfo(){
        System.out.println("running getInfo in Cache");
    }
    public void refresh(){
        System.out.println("running refresh in Cache");
    }
    public void save(){
        System.out.println("running save in Cache");
    }
}
