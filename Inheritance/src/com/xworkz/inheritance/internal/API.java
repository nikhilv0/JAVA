package com.xworkz.inheritance.internal;

public class API extends Resource{
    public API(){
        super();
        System.out.println("running cont API");
    }
    @Override
    public void load(){
        System.out.println("running load in API");
    }
    public void release(){
        System.out.println("running release in API");
    }
    public void getInfo(){
        System.out.println("running getInfo in API");
    }
    public void refresh(){
        System.out.println("running refresh in API");
    }
    public void save(){
        System.out.println("running save in API");
    }
}
