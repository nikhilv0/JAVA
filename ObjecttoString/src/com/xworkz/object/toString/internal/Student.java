package com.xworkz.object.toString.internal;

public class Student {
    String name;
    int rollNumber;
    double grade;
    public Student(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Student {Name: " + this.name + ", Roll Number: " + this.rollNumber + ", Grade: " + this.grade + "}";
    }
}
