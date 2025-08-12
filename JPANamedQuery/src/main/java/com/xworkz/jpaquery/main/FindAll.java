package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        AadhaarService aadhaarService =new AadhaarServiceImp();
        List<AadhaarEntity> aadharEntities= aadhaarService.findAll();
        for (AadhaarEntity aadhaarEntity :aadharEntities){
            System.out.println(aadhaarEntity);
        }
    }
}
