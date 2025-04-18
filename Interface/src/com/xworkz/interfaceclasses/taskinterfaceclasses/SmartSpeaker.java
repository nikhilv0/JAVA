package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface SmartSpeaker {
    public void playMusic();
    public void increaseVolume();
    public void askAssistant();
    default void display(){
        System.out.println("Running default method");
    }
}
