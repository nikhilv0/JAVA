package com.xworkz.service;

import com.xworkz.dto.JobDTO;
import com.xworkz.repository.JobRepository;
import com.xworkz.repository.JobRepositoryImp;

public class JobserviceImp implements Jobservice {


    @Override
    public String validateandsave(JobDTO jobdto) {
        System.out.println("running JobserviceImp class");

        if (jobdto!=null){
            JobRepository jobRepository=new JobRepositoryImp();
            jobRepository.save(jobdto);
        }
        return "sucessfull";
    }

}
