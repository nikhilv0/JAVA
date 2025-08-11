package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

import java.util.List;

public class GetEntityByAge {
    public static void main(String[] args) {

        AadharService aadharService=new AadharServiceImp();
        List<AadharEntity> aadharEntity=aadharService.getEntityByAge(18);
        List<AadharEntity> aadharEntity1=aadharService.getEntityByAge(20);
        System.out.println(aadharEntity.toString()+" \n"+aadharEntity1.toString());
    }
}
