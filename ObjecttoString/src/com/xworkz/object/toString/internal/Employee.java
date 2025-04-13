package com.xworkz.object.toString.internal;

public class Employee {
    private String name;
    private int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee {Name: " + this.name + ", ID: " + this.id + ", Salary: $" + this.salary + "}";
    }
    @Override
    public int hashCode() {
        return 69;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Employee){
                Employee empolyee=this;
                Employee empolyee2=(Employee) obj;
                if (empolyee.name.equals(empolyee2.name)){
                    return true;
                }
            }
        }
        return false;
    }
}
