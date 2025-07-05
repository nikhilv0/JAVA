package com.xworkz.service;

import com.xworkz.dto.DonorRegistrationDTO;
import com.xworkz.repository.DonorRegistrationRepository;
import com.xworkz.repository.DonorRegistrationRepositoryImp;

import java.io.Serializable;
import java.time.LocalDate;

public class DonorRegistrationServiceImp implements DonorRegistrationService {

    @Override
    public String validateAndSave(DonorRegistrationDTO donorRegistrationDTO) {

        if (donorRegistrationDTO!=null){
            String name=donorRegistrationDTO.getName();
            int age=donorRegistrationDTO.getAge();
            String gender=donorRegistrationDTO.getName();
//        String bloodGroup=donorRegistrationDTO.getName();
            long contact=donorRegistrationDTO.getContact();
//        String address=donorRegistrationDTO.getName();
            LocalDate lastDonationDate=donorRegistrationDTO.getLastDonationDate();

            if (name==null || name.length()<5 || name.length()>30) {
                System.out.println("name is invalid");
                return "Name must be between 5 and 30 characters";
            }
            if (age<17 || age>100){
                System.out.println("age is invalid");
                return "Age must be between 17 and 100";
            }
            if (String.valueOf(contact).length() != 10){
                System.out.println("contact is invalid");
                return "Contact number must be exactly 10 digits";

            }
            if (gender == null || !(gender.equals("Male") || gender.equals("Female") || gender.equals("Other"))){
                System.out.println("gender is invalid");
                return "Please select a valid gender";
            }

            DonorRegistrationRepository donorRegistrationRepository=new DonorRegistrationRepositoryImp();
            donorRegistrationRepository.save(donorRegistrationDTO);

        }
        return "successfully submitted Application";
    }

    public DonorRegistrationDTO findById(int id){
        if (id<0){
            System.out.println("ID is Invalid");
            return null;
        }
        else {
            System.out.println("id is valid");
            DonorRegistrationRepository donorRegistrationRepository=new DonorRegistrationRepositoryImp();
            return donorRegistrationRepository.findBy(id);

        }

    }
}
