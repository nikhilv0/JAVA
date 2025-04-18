package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface Speaker {
    public void playSound();
    public void increaseVolume();
    public void decreaseVolume();
    default void display(){
        System.out.println("Running default method");
    }
}
