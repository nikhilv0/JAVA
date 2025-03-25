package com.xworkz.RefAndvar;

public class Education {
    String schoolName;
    int totalStudents;
    double passPercentage;
    String boardType;

    Education(String schoolName, int totalStudents, double passPercentage, String boardType) {
        this.schoolName = schoolName;
        this.totalStudents = totalStudents;
        this.passPercentage = passPercentage;
        this.boardType = boardType;
    }

    void educationMethod() {
        System.out.println("Education:");
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Pass Percentage: " + passPercentage + "%");
        System.out.println("Board Type: " + boardType);
    }
}

