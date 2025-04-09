package com.xworkz.inheritance.internal;

public class Credential extends Resource{
    public Credential() {
        super();
        System.out.println("Running constructor of Credential class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Credential");
    }
    public void release(){
        System.out.println("running release in Credential");
    }
    public void getInfo(){
        System.out.println("running getInfo in Credential");
    }
    public void refresh(){
        System.out.println("running refresh in Credential");
    }
    public void save(){
        System.out.println("running save in Credential");
    }
    public void run(){
        System.out.println("running save in Credential");
    }
}
