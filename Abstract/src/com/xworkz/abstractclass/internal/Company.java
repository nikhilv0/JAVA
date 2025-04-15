package com.xworkz.abstractclass.internal;

public abstract class Company {

    public abstract void complete();

    public void incomplete(){
        System.out.println("non abstract incomplete method in Company");
    }

}
