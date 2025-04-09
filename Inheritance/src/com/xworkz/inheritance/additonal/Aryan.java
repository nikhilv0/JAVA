package com.xworkz.inheritance.additonal;

public class Aryan extends Model {
    public Aryan(){
        super();
        System.out.println("Running constructor of Aryan class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in Aryan class");
    }

    public void pose() {
        System.out.println("Posing in Aryan class");
    }

    public void design() {
        System.out.println("design in Aryan class");
    }

    public void dance() {
        System.out.println("dancing in Aryan class");
    }

    public void display() {
        System.out.println("Displaying in Aryan class");
    }
    public void aryan() {
        System.out.println("aryan in Aryan class");
    }
}
