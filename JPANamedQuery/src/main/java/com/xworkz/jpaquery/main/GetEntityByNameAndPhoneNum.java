package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

public class GetEntityByNameAndPhoneNum {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        AadharEntity aadharEntity=aadharService.getEntityByNameAndPhoneNum("Rahul",9876543210L);
        AadharEntity aadharEntity1=aadharService.getEntityByNameAndPhoneNum("Anjali",9667788990L);
        System.out.println(aadharEntity+" \n"+aadharEntity1);
    }
}
