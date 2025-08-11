package com.xworkz.jpaquery.service;

import com.xworkz.jpaquery.entity.AadharEntity;
import com.xworkz.jpaquery.repository.AadharRepositoy;
import com.xworkz.jpaquery.repository.AadharRepositoyImp;

import java.util.Collections;
import java.util.List;

public class AadharServiceImp implements AadharService{

    AadharRepositoy aadharRepositoy=new AadharRepositoyImp();
    @Override
    public String save(AadharEntity aadharEntity) {
        System.out.println("Validate and Save");

        return aadharRepositoy.save(aadharEntity);
    }

    @Override
    public List<AadharEntity> findAll() {
        System.out.println("find All");
        return aadharRepositoy.findbyall();
    }

    @Override
    public AadharEntity getEntityByName(String name) {
        System.out.println("getEntityByName");
        return aadharRepositoy.getEntityByName(name);
    }

    @Override
    public AadharEntity getEntityByNameAndPlace(String name, String place) {
        System.out.println("getEntityByNameAndPlace");
        return aadharRepositoy.getEntityByNameAndPlace(name,place);
    }

    @Override
    public AadharEntity getEntityByNameAndPhoneNum(String name, Long number) {
        System.out.println("getEntityByNameAndPhoneNum");
        return aadharRepositoy.getEntityByNameAndPhoneNum(name,number);
    }

    @Override
    public List<AadharEntity> getEntityByAge(int age) {
        System.out.println("getEntityByAge");
        return aadharRepositoy.getEntityByAge(age);
    }
}
