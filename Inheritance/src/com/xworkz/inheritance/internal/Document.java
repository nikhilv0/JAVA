package com.xworkz.inheritance.internal;

public class Document extends Resource{
    public Document() {
        super();
        System.out.println("Running constructor of Document class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Document");
    }
    public void release(){
        System.out.println("running release in Document");
    }
    public void getInfo(){
        System.out.println("running getInfo in Document");
    }
    public void refresh(){
        System.out.println("running refresh in Document");
    }
    public void save(){
        System.out.println("running save in Document");
    }
}
