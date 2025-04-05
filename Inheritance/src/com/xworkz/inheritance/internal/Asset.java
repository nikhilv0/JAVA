package com.xworkz.inheritance.internal;

public class Asset extends Resource{
    public Asset() {
        super();
        System.out.println("Running constructor of Asset class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Asset");
    }
    public void release(){
        System.out.println("running release in Asset");
    }
    public void getInfo(){
        System.out.println("running getInfo in Asset");
    }
    public void refresh(){
        System.out.println("running refresh in Asset");
    }
    public void save(){
        System.out.println("running save in Asset");
    }
}
