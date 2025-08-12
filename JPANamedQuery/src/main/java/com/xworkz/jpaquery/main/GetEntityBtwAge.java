package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

import java.util.List;

public class GetEntityBtwAge {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        List<AadhaarEntity> aadhaarEntity = aadhaarService.getEntityBtwAge(10,20);
        for ( AadhaarEntity aadharEntities: aadhaarEntity){    /// ?????
            System.out.println(aadharEntities);
        }
    }
}
