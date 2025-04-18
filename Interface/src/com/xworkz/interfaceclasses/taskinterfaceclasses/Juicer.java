package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Juicer {
    public void extractJuice();
    public void cleanJuicer();
    public void stopJuicer();
    default void display(){
        System.out.println("Running default method");
    }
}
