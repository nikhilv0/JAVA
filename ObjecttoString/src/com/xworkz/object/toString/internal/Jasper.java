package com.xworkz.object.toString.internal;

public class Jasper {
    private String favoriteColor;
    private int age;
    private double height;

    public Jasper(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Jasper{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 53;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Jasper){
                Jasper jasper=this;
                Jasper jasper2=(Jasper) obj;
                if (jasper.favoriteColor.equals(jasper2.favoriteColor) && jasper.age==(jasper2.age)){
                    return true;
                }
            }
        }
        return false;
    }
}
