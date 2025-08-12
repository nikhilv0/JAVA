package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEntityByEmail {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getEntityByEmail("priya.kumar@yahoo.com");
        System.out.println(aadhaarEntity);
    }
}
