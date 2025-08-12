package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEntityByNameAndPhoneNum {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getEntityByNameAndPhoneNum("Rahul",9876543210L);
        AadhaarEntity aadhaarEntity1 = aadhaarService.getEntityByNameAndPhoneNum("Anjali",9667788990L);
        System.out.println(aadhaarEntity +" \n"+ aadhaarEntity1);
    }
}
