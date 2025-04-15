package com.xworkz.inheritancetypes.Runner;

import com.xworkz.inheritancetypes.mutlilevel.*;

public class MutliMainRunner {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
        sc.turboBoost();

        CollegeStudent cs = new CollegeStudent();
        cs.introduce();
        cs.study();
        cs.attendLecture();

        Human human = new Human();
        human.eat();
        human.walk();
        human.speak();

        Microwave mw = new Microwave();
        mw.turnOn();
        mw.use();
        mw.heatFood();

        BusinessAccount ba = new BusinessAccount();
        ba.open();
        ba.deposit();
        ba.transferFunds();

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.loadOS();
        laptop.fold();

        WordDocument wd = new WordDocument();
        wd.create();
        wd.write();
        wd.format();
    }
}


