package com.xworkz.object.toString.internal;

public class Leo {
    private String favoriteColor;
    private int age;
    private double height;

    public Leo(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Leo{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 46;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Leo){
                Leo leo=this;
                Leo leo2=(Leo) obj;
                if (leo.favoriteColor.equals(leo2.favoriteColor) && leo.age==(leo2.age)){
                    return true;
                }
            }
        }
        return false;
    }
}
