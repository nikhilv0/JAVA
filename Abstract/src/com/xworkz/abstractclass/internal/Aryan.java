package com.xworkz.abstractclass.internal;

public abstract class Aryan {

    private String name,lastname;
    private char gender;

    public Aryan(String name,String lastname,char gender){
        this.name=name;
        this.lastname=lastname;
        this.gender=gender;
    }
    public void print(){
        System.out.println(name+lastname+gender);
    }
}
