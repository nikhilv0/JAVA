package com.xworkz.jpaquery.main;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.service.AadhaarService;
import com.xworkz.jpaquery.service.AadhaarServiceImp;

public class GetIdAndNameByNameAndPlace {
    public static void main(String[] args) {

        AadhaarService aadhaarService =new AadhaarServiceImp();
        AadhaarEntity aadhaarEntity = aadhaarService.getIdAndNameByNameAndPlace("Priya","Mysuru");
        System.out.println(aadhaarEntity.getId()+" \n"+ aadhaarEntity.getName());
    }
}
