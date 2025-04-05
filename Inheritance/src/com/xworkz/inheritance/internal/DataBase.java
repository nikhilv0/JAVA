package com.xworkz.inheritance.internal;

public class DataBase extends Resource{
    public DataBase(){
        super();
        System.out.println("running  const database in class");
    }
    @Override
    public void load(){
        System.out.println("running load in database");
    }
    public void release(){
        System.out.println("running release in database");
    }
    public void getInfo(){
        System.out.println("running getInfo in database");
    }
    public void refresh(){
        System.out.println("running refresh in database");
    }
    public void save(){
        System.out.println("running save in database");
    }
}
