package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

import java.util.List;
import java.util.Set;

public class GetAgeAndPhoneNum {
    public static void main(String[] args) {

        AadhaarService aadhaarService = new AadhaarServiceImp();
        Set<AadhaarEntity> aadhaarEntities = aadhaarService.getAgeAndPhoneNum();
        for (AadhaarEntity aadhaarEntity : aadhaarEntities) {
            System.out.println("age:"+aadhaarEntity.getAge() +" "+"phone:" + aadhaarEntity.getPhoneNumber());
        }
    }
}
