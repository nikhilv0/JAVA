package com.xworkz.inheritance.internal;

public class Content extends Resource{
    public Content() {
        super();
        System.out.println("Running constructor of Content class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Content");
    }
    public void release(){
        System.out.println("running release in Content");
    }
    public void getInfo(){
        System.out.println("running getInfo in Content");
    }
    public void refresh(){
        System.out.println("running refresh in Content");
    }
    public void save(){
        System.out.println("running save in Content");
    }
}
