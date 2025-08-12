package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetPhoneNumAndPlaceByMail {
    public static void main(String[] args) {

        AadhaarService aadhaarService=new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity=aadhaarService.getPhoneNumAndPlaceByMail("priya.kumar@yahoo.com");
        System.out.println(aadhaarEntity.getPhoneNumber()+"\n"+aadhaarEntity.getPlace());
    }
}
