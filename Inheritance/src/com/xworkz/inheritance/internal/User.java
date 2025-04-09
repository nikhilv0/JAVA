package com.xworkz.inheritance.internal;

public class User extends Resource{
    public User() {
        super();
        System.out.println("Running constructor of User class.");
    }
    @Override
    public void load(){
        System.out.println("running load in User");
    }
    public void release(){
        System.out.println("running release in User");
    }
    public void getInfo(){
        System.out.println("running getInfo in User");
    }
    public void refresh(){
        System.out.println("running refresh in User");
    }
    public void save(){
        System.out.println("running save in User");
    }
    public void compile(){
        System.out.println("running save in User");
    }
}
