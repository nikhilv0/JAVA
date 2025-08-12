package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEmailAndPhoneNumByName {
    public static void main(String[] args) {

        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getEmailAndPhoneNumByName("Rahul");
        System.out.println("Mail:"+ aadhaarEntity.getEmail());
        System.out.println("Phone Number"+ aadhaarEntity.getPhoneNumber());
    }
}
