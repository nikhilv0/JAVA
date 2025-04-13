package com.xworkz.object.toString.internal;

public class Brother {
    private String name, lastname;
    private int age;
    public Brother(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Brother {Name:" + this.name + " Last Name:" + this.lastname + " age:" + this.age + "}";
    }
    @Override
    public int hashCode() {
        return 99;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Brother){
                Brother brother=this;
                Brother brother2=(Brother) obj;
                if (brother.name.equals(brother2.name)){
                    return true;
                }
            }
        }
        return false;
    }
}