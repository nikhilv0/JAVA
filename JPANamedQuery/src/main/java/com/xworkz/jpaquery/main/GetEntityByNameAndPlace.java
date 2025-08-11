package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

public class GetEntityByNameAndPlace {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        AadharEntity aadhar=aadharService.getEntityByNameAndPlace("Rahul","Bengaluru");
        AadharEntity aadhar1=aadharService.getEntityByNameAndPlace("Meena","Mangaluru");
        System.out.println(aadhar.toString()+" \n"+aadhar1.toString());
    }
}
