package com.xworkz.inheritance.internal;

public class Video extends Resource{
    public Video() {
        super();
        System.out.println("Running constructor of Video class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Video");
    }
    public void release(){
        System.out.println("running release in Video");
    }
    public void getInfo(){
        System.out.println("running getInfo in Video");
    }
    public void refresh(){
        System.out.println("running refresh in Video");
    }
    public void save(){
        System.out.println("running save in Video");
    }
}
