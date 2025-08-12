package com.xworkz.jpaquery.service;

import com.xworkz.jpaquery.entity.AadhaarEntity;
import com.xworkz.jpaquery.repository.AadhaarRepository;
import com.xworkz.jpaquery.repository.AadhaarRepositoryImp;

import java.util.List;

public class AadhaarServiceImp implements AadhaarService {

    AadhaarRepository aadhaarRepository =new AadhaarRepositoryImp();
    @Override
    public String save(AadhaarEntity aadhaarEntity) {
        System.out.println("Validate and Save");

        return aadhaarRepository.save(aadhaarEntity);
    }

    @Override
    public List<AadhaarEntity> findAll() {
        System.out.println("find All");
        return aadhaarRepository.findbyall();
    }

    @Override
    public AadhaarEntity getEntityByName(String name) {
        System.out.println("getEntityByName");
        return aadhaarRepository.getEntityByName(name);
    }

    @Override
    public AadhaarEntity getEntityByNameAndPlace(String name, String place) {
        System.out.println("getEntityByNameAndPlace");
        return aadhaarRepository.getEntityByNameAndPlace(name,place);
    }

    @Override
    public AadhaarEntity getEntityByNameAndPhoneNum(String name, Long number) {
        System.out.println("getEntityByNameAndPhoneNum");
        return aadhaarRepository.getEntityByNameAndPhoneNum(name,number);
    }

    @Override
    public List<AadhaarEntity> getEntityByAge(int age) {
        System.out.println("getEntityByAge");
        return aadhaarRepository.getEntityByAge(age);
    }

    @Override
    public List<AadhaarEntity> getEntityBtwAge(int minAge, int maxAge) {
        System.out.println("getEntityBtwAge");
        return aadhaarRepository.getEntityBtwAge(minAge,maxAge);
    }

    @Override
    public AadhaarEntity getEntityByEmail(String mail) {
        System.out.println("getEntityByEmail");
        return aadhaarRepository.getEntityByEmail(mail);
    }

    @Override
    public AadhaarEntity getEntityByPhoneNum(Long phoneNum) {
        System.out.println("getEntityByPhoneNum");
        return aadhaarRepository.getEntityByPhoneNum(phoneNum);
    }

    @Override
    public AadhaarEntity getEmailAndPhoneNumByName(String name) {
        System.out.println("getEmailAndPhoneNumByName");
        return aadhaarRepository.getEmailAndPhoneNumByName(name);
    }

    @Override
    public AadhaarEntity getIdAndNameByNameAndPlace(String name, String place) {
        System.out.println("getIdAndNameByNameAndPlace");
        return aadhaarRepository.getIdAndNameByNameAndPlace(name,place);
    }

    @Override
    public AadhaarEntity getPhoneNumAndPlaceByMail(String mail) {
        System.out.println("getPhoneNumAndPlaceByMail");
        return aadhaarRepository.getPhoneNumAndPlaceByMail(mail);
    }


}
