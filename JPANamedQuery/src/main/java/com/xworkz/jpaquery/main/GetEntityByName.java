package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEntityByName {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getEntityByName("Rahul");
        AadhaarEntity aadhaarEntity1 = aadhaarService.getEntityByName("Priya");
        System.out.println(aadhaarEntity.toString()+"\n"+ aadhaarEntity1.toString());
    }
}
