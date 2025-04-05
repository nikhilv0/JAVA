package com.xworkz.inheritance.internal;

public class Resource {

    public Resource(){
        super();
        System.out.println("running const of Resource class");
    }
    public void load(){
        System.out.println("running load in resource");
    }
    public void release(){
        System.out.println("running release in resource");
    }
    public void getInfo(){
        System.out.println("running getInfo in resource");
    }
    public void refresh(){
        System.out.println("running refresh in resource");
    }
    public void save(){
        System.out.println("running save in resource");
    }
}
