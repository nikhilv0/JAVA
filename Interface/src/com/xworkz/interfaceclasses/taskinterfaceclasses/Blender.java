package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Blender {
    public void startBlending();
    public void stopBlending();
    public void pulseBlend();
    default void display(){
        System.out.println("Running default method");
    }
}
