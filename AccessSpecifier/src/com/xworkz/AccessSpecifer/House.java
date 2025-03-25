package com.xworkz.AccessSpecifer;

public class House {
    public String name;
    private Double maintance;
    long contactNo;

   private void build(){
        System.out.println("Maintance::"+this.maintance);

    }
    void design(){

        build();
    }
    public void demonish(){
        System.out.println("Name:"+this.name);
        System.out.println();
    }


}
