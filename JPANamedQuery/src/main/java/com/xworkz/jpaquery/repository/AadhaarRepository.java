package com.xworkz.jpaquery.repository;

import com.xworkz.jpaquery.entity.AadhaarEntity;

import java.util.List;
import java.util.Set;

public interface AadhaarRepository {

   String save(AadhaarEntity aadhaarEntity);

   List<AadhaarEntity> findbyall();

   AadhaarEntity getEntityByName(String name);

   AadhaarEntity getEntityByNameAndPlace(String name, String place);

   AadhaarEntity getEntityByNameAndPhoneNum(String name, Long number);

   List<AadhaarEntity> getEntityByAge(int age);

   List<AadhaarEntity> getEntityBtwAge(int minAge, int maxAge);

   AadhaarEntity getEntityByEmail(String mail);

   AadhaarEntity getEntityByPhoneNum(Long phoneNum);

   AadhaarEntity getEmailAndPhoneNumByName(String name);

   AadhaarEntity getIdAndNameByNameAndPlace(String name, String place);

   AadhaarEntity getPhoneNumAndPlaceByMail(String mail);

   Set<AadhaarEntity> getAgeAndPhoneNum();
}
