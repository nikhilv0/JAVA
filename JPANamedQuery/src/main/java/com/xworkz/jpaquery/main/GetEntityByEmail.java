package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

public class GetEntityByEmail {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        AadharEntity aadharEntity=aadharService.getEntityByEmail("priya.kumar@yahoo.com");
        System.out.println(aadharEntity);
    }
}
