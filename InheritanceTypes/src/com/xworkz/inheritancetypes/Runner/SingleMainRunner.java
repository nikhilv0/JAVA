package com.xworkz.inheritancetypes.Runner;

import com.xworkz.inheritancetypes.single.*;

public class SingleMainRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.openTrunk();

        Manager manager = new Manager();
        manager.work();
        manager.conductMeeting();

        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();

        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.washClothes();

        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.useApp();

        House house = new House();
        house.openDoor();
        house.enterRoom();

        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.calculateInterest();

        EBook ebook = new EBook();
        ebook.read();
        ebook.download();

        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();

        Student student = new Student();
        student.introduce();
        student.study();

        FloweringPlant flower = new FloweringPlant();
        flower.grow();
        flower.bloom();
    }
}


