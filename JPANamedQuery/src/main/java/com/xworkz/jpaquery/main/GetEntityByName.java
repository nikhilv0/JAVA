package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

public class GetEntityByName {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        AadharEntity aadharEntity=aadharService.getEntityByName("Rahul");
        AadharEntity aadharEntity1=aadharService.getEntityByName("Priya");
        System.out.println(aadharEntity.toString()+"\n"+aadharEntity1.toString());
    }
}
