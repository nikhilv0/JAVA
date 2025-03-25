package com.xworkz.RefAndvar;

public class District {
    String Districtname;
    String Countryname;
    int NoofTaluk;
    String Statename;

    District(String Districtname,String Countryname,int NoofTaluk,String Statename){
        this.Districtname=Districtname;
        this.Countryname=Countryname;
        this.NoofTaluk=NoofTaluk;
        this.Statename=Statename;

    }
    void Districtmethod(){
        System.out.println("District:");
        System.out.println("Districtname:"+this.Districtname);
        System.out.println("Countryname:"+this.Countryname);
        System.out.println("NoofTaluk:"+this.NoofTaluk);
        System.out.println("Statename:"+this.Statename);
    }
}
