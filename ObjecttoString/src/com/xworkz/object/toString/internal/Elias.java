package com.xworkz.object.toString.internal;

public class Elias {
    private String favoriteColor;
    private int age;
    private double height;

    public Elias(String favoriteColor, int age, double height) {
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Elias{favoriteColor='" + favoriteColor + "', age=" + age + ", height=" + height + "}";
    }
    @Override
    public int hashCode() {
        return 71;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Elias){
                Elias elias=this;
                Elias elias2=(Elias) obj;
                if (elias.favoriteColor.equals(elias2.favoriteColor)){
                    return true;
                }
            }
        }
        return false;
    }
}
