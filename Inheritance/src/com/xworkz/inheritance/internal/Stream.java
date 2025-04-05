package com.xworkz.inheritance.internal;

public class Stream extends Resource{
    public Stream() {
        super();
        System.out.println("Running constructor of Stream class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Stream");
    }
    public void release(){
        System.out.println("running release in Stream");
    }
    public void getInfo(){
        System.out.println("running getInfo in Stream");
    }
    public void refresh(){
        System.out.println("running refresh in Stream");
    }
    public void save(){
        System.out.println("running save in Stream");
    }
}
