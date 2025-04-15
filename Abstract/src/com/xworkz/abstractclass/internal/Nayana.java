package com.xworkz.abstractclass.internal;

public abstract class Nayana {

    private String name,lastname;
    private boolean mental;
    private char gender;

    public Nayana(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    public Nayana(boolean mental){
        this.mental=mental;
    }
    public Nayana(char gender){
        this.gender=gender;
    }
    public void display(){
        System.out.println(name+lastname+gender+mental);
    }
}
