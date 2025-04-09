package com.xworkz.inheritance.internal;

public class Audio extends Resource{
    public Audio() {
        super();
        System.out.println("Running constructor of Audio class.");
    }
    @Override
    public void load(){
        System.out.println("running load in Audio");
    }
    public void release(){
        System.out.println("running release in Audio");
    }
    public void getInfo(){
        System.out.println("running getInfo in Audio");
    }
    public void refresh(){
        System.out.println("running refresh in Audio");
    }
    public void save(){
        System.out.println("running save in Audio");
    }
    public void listen(){
        System.out.println("running listen in Audio");
    }
}
