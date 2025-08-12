package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetEntityByPhoneNum {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getEntityByPhoneNum(9012345678L);
        System.out.println(aadhaarEntity);
    }

}
