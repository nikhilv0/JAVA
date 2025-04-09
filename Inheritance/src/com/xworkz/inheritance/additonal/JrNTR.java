package com.xworkz.inheritance.additonal;

public class JrNTR extends Model {
    public JrNTR() {
        super();
        System.out.println("Running constructor of JrNTR class");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in JrNTR class");
    }

    public void pose() {
        System.out.println("Posing in JrNTR class");
    }

    public void design() {
        System.out.println("design in JrNTR class");
    }

    public void dance() {
        System.out.println("dancing in JrNTR class");
    }

    public void display() {
        System.out.println("Displaying in JrNTR class");
    }
    public void ntr() {
        System.out.println("ntr in JrNTR class");
    }
}
