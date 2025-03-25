package com.xworkz.RefAndvar;

public class Ward {
    String WardName;
    int WardNumber;
    String Municipality;
    String ZonalOffice;

    Ward(String WardName,int WardNumber,String Municipality,String ZonalOffice){
        this.WardName=WardName;
        this.WardNumber=WardNumber;
        this.Municipality=Municipality;
        this.ZonalOffice=ZonalOffice;

    }
    void wardMethod(){
        System.out.println("Ward:");
        System.out.println("WardName:"+this.WardName);
        System.out.println("WardNumber:"+this.WardNumber);
        System.out.println("Municipality:"+this.Municipality);
        System.out.println("ZonalOffice:"+this.ZonalOffice);
    }
}
