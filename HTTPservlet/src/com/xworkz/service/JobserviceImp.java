package com.xworkz.service;

import com.xworkz.dto.jobDTO;
import com.xworkz.repository.JobRepository;
import com.xworkz.repository.JobRepositoryImp;

public class JobserviceImp implements Jobservice {


    @Override
    public String validateandsave(jobDTO jobdto) {
        System.out.println("running JobserviceImp class");

        if (jobdto!=null){
            JobRepository jobRepository=new JobRepositoryImp();
            jobRepository.save();
        }
        return "sucessfull";
    }

}
