package com.xworkz.inheritance.additonal;

public class Shashank extends Model{
    public Shashank(){
        super();
        System.out.println("Running constructor of Shashank");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in Shashank class");
    }

    public void pose() {
        System.out.println("Posing in Shashank class");
    }

    public void design() {
        System.out.println("design in Shashank class");
    }

    public void dance() {
        System.out.println("dancing in Shashank class");
    }

    public void display() {
        System.out.println("Displaying in Shashank class");
    }
}
