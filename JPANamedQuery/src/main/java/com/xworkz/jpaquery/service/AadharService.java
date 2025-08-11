package com.xworkz.jpaquery.service;

import com.xworkz.jpaquery.entity.AadharEntity;

import java.util.List;

public interface AadharService {

   String save(AadharEntity aadharEntity);

   List<AadharEntity> findAll();

   AadharEntity getEntityByName(String name);

   AadharEntity getEntityByNameAndPlace(String name,String place);

   AadharEntity getEntityByNameAndPhoneNum(String name,Long number);

   List<AadharEntity> getEntityByAge(int age);

   List<AadharEntity> getEntityBtwAge(int minAge,int maxAge);

   AadharEntity getEntityByEmail(String mail);

   AadharEntity getEntityByPhoneNum(Long phoneNum);
}
