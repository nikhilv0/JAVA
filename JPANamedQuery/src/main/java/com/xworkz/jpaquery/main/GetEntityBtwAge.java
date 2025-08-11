package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

import java.util.List;

public class GetEntityBtwAge {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        List<AadharEntity> aadharEntity=aadharService.getEntityBtwAge(10,20);
        for ( AadharEntity aadharEntities:aadharEntity){    /// ?????
            System.out.println(aadharEntities);
        }
    }
}
