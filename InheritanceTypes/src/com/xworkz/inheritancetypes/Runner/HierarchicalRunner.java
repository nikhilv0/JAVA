package com.xworkz.inheritancetypes.Runner;


import com.xworkz.inheritancetypes.hierarchical.*;

public class HierarchicalRunner {
        public static void main(String[] args) {

            Car car = new Car();
            car.start();
            car.drive();

            Truck truck = new Truck();
            truck.start();
            truck.loadCargo();

            Bike bike = new Bike();
            bike.start();
            bike.pedal();

            Dog dog = new Dog();
            dog.eat();
            dog.bark();

            Cat cat = new Cat();
            cat.eat();
            cat.meow();

            Cow cow = new Cow();
            cow.eat();
            cow.moo();

            Smartphone smartphone = new Smartphone();
            smartphone.powerOn();
            smartphone.useApp();

            Tablet tablet = new Tablet();
            tablet.powerOn();
            tablet.watchVideo();

            Smartwatch smartwatch = new Smartwatch();
            smartwatch.powerOn();
            smartwatch.trackSteps();

            Teacher teacher = new Teacher();
            teacher.introduce();
            teacher.teach();

            Engineer engineer = new Engineer();
            engineer.introduce();
            engineer.code();

            Doctor doctor = new Doctor();
            doctor.introduce();
            doctor.diagnose();

            WashingMachine washingMachine = new WashingMachine();
            washingMachine.turnOn();
            washingMachine.washClothes();

            Refrigerator refrigerator = new Refrigerator();
            refrigerator.turnOn();
            refrigerator.cool();

            Oven oven = new Oven();
            oven.turnOn();
            oven.bake();
        }
    }