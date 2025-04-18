package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface IceMaker {
    public void startIceMaking();
    public void stopIceMaking();
    public void checkIceLevel();
    default void display(){
        System.out.println("Running default method");
    }
}
