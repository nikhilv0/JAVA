package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.ArcadeMachine;

public class ArcadeMachineImpl implements ArcadeMachine {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void startGame() {
        System.out.println("Game started");
    }

    @Override
    public void endGame() {
        System.out.println("Game ended");
    }

    @Override
    public void display() {
        ArcadeMachine.super.display();
    }
}
