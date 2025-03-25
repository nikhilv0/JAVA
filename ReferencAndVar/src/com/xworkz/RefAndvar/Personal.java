package com.xworkz.RefAndvar;

public class Personal {
    String name;
    int age;
    String address;
    String phoneNumber;

    Personal(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    void personalMethod() {
        System.out.println("Personal Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);

        Skill skill=new Skill("Fullstack",5,10,true);
        skill.SkillMehtod();
    }
}
