package com.xworkz.object.toString.internal;

public class Maya {
    private String favoriteColor;
    private int age;
    private double height;

    public Maya(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Maya{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 43;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Maya){
                Maya maya=this;
                Maya maya2=(Maya) obj;
                if (maya.favoriteColor.equals(maya2.favoriteColor) && maya.age==(maya2.age)){
                    return true;
                }
            }
        }
        return false;
    }
}
