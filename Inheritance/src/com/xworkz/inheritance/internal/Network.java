package com.xworkz.inheritance.internal;

public class Network extends Resource{
    public Network(){
        super();
        System.out.println("running const Network");
    }
    @Override
    public void load(){
        System.out.println("running load in Network");
    }
    public void release(){
        System.out.println("running release in Network");
    }
    public void getInfo(){
        System.out.println("running getInfo in Network");
    }
    public void refresh(){
        System.out.println("running refresh in Network");
    }
    public void save(){
        System.out.println("running save in Network");
    }
}
