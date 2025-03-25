package com.xworkz.AccessSpecifer;

public class Frame {
    public String type;
    private int size;
    double cost;

    private void onWall(){
        System.out.println("Size:"+this.size);
    }
    void price(){
        System.out.println("Cost:"+this.cost);
    }
    public void DiffType(){
        onWall();
    }

}
