package com.xworkz.object.toString.internal;

public class Ava {
    private String favoriteColor;
    private int age;
    private double height;

    public Ava(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ava{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 91;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Ava){
                Ava ava=this;
                Ava ava2=(Ava) obj;
                if (ava.favoriteColor.equals(ava2.favoriteColor)){
                    return true;
                }
            }
        }
        return false;
    }
}
