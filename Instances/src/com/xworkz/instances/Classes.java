package com.xworkz.instances;

public class Classes implements Cloneable{
    private String a;
    private int b;

    public Classes(String a,int b){
        this.a=a;
        this.b=b;
//        System.out.println(a+b);
    }

    @Override
    public String toString() {
        return "Classes{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public void run(){
    System.out.println("run");
}

    @Override
    public Classes clone() {
        try {
            Classes clone = (Classes) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
