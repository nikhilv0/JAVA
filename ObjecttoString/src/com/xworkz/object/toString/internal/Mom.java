package com.xworkz.object.toString.internal;

public class Mom {
    private String name, lastname;
    private int age;

    public Mom(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mom {Name:" + this.name + " Last Name:" + this.lastname + " age:" + this.age + "}";
    }

    @Override
    public int hashCode() {
        return 96;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Mom){
                Mom mom=this;
                Mom mom2=(Mom) obj;
                if (mom.name.equals(mom2.name) && mom.lastname.equals(mom2.lastname)){
                    return true;
                }
            }
        }
        return false;
    }
}
