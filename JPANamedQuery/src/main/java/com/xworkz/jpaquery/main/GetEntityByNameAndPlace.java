package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEntityByNameAndPlace {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhar= aadhaarService.getEntityByNameAndPlace("Rahul","Bengaluru");
        AadhaarEntity aadhar1= aadhaarService.getEntityByNameAndPlace("Meena","Mangaluru");
        System.out.println(aadhar.toString()+" \n"+aadhar1.toString());
    }
}
