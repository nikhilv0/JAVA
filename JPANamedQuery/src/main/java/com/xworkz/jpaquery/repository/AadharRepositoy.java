package com.xworkz.jpaquery.repository;

import com.xworkz.jpaquery.entity.AadharEntity;

import java.util.List;

public interface AadharRepositoy {

   String save(AadharEntity aadharEntity);

   List<AadharEntity> findbyall();

   AadharEntity getEntityByName(String name);

   AadharEntity getEntityByNameAndPlace(String name,String place);

   AadharEntity getEntityByNameAndPhoneNum(String name,Long number);

   List<AadharEntity> getEntityByAge(int age);
}
