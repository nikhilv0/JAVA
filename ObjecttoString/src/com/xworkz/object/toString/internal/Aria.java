package com.xworkz.object.toString.internal;

public class Aria {
    private String favoriteColor;
    private int age;
    private double height;

    public Aria(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Aria{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 92;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Aria){
                Aria aria=this;
                Aria aria2=(Aria) obj;
                if (aria.favoriteColor.equals(aria2.favoriteColor)){
                    return true;
                }
            }
        }
        return false;
    }
}
