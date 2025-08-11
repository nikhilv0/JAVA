package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.service.AadharService;
import com.xworkz.jpaquery.service.AadharServiceImp;

public class GetEntityByPhoneNum {
    public static void main(String[] args) {
        AadharService aadharService=new AadharServiceImp();
        AadharEntity aadharEntity=aadharService.getEntityByPhoneNum(9012345678L);
        System.out.println(aadharEntity);
    }

}
