package com.xworkz.inheritance.internal;

public class Session extends Resource{
    public Session() {
        super();
        System.out.println("Running constructor of Session class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Session");
    }
    public void release(){
        System.out.println("running release in Session");
    }
    public void getInfo(){
        System.out.println("running getInfo in Session");
    }
    public void refresh(){
        System.out.println("running refresh in Session");
    }
    public void save(){
        System.out.println("running save in Session");
    }
    public void start(){
        System.out.println("running Start in Session");
    }
}
