package com.xworkz.GetterAndSetter;

public class Lens {
    void lenseDisplay(Camera camera){
        if (camera!=null){
            System.out.println("Brand:"+camera.getBrand());
            System.out.println("Price:"+camera.getPrice());
            System.out.println("Camera Type:"+camera.getCamType());
            System.out.println("Connectivity:"+camera.getConnectivity());
        }
    }
}
