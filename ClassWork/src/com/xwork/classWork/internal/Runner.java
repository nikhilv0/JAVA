package com.xwork.classWork.internal;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber=new Tyre();
        rubber.expand();

        Rubber rubber1=new Rubber();
        rubber.expand();

        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        MRFtyre mrFtyre=new MRFtyre();
        mrFtyre.expand();
        mrFtyre.radial();
        mrFtyre.compress();

        ArmyVechicle armyVechicle=new ArmyVechicle();
        armyVechicle.wheel(rubber);
        armyVechicle.wheel(tyre);
        armyVechicle.wheel(mrFtyre);
        armyVechicle.wheel(rubber1);
    }
}
