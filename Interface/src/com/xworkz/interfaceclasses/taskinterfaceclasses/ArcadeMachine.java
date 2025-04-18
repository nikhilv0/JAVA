package com.xworkz.interfaceclasses.taskinterfaceclasses;

public interface ArcadeMachine {
    public void insertCoin();
    public void startGame();
    public void endGame();
    default void display(){
        System.out.println("Running default method");
    }
}
