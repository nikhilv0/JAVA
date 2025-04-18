package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface PetFeeder {
    public void dispenseFood();
    public void setFeedingSchedule();
    public void checkFoodLevel();
    default void display(){
        System.out.println("Running default method");
    }
}
