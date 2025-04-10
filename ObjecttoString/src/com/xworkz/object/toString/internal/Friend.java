package com.xworkz.object.toString.internal;

public class Friend {
    private String name, lastname;
    private int age;
    public Friend(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Friend {Name:" + this.name + " Last Name:" + this.lastname + " age:" + this.age + "}";
    }
    @Override
    public int hashCode() {
        return 98;
    }
}
