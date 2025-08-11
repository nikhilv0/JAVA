package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        List<AadharEntity> aadharEntities=aadharService.findAll();
        System.out.println("\n"+aadharEntities.toString()+"\n");
    }
}
