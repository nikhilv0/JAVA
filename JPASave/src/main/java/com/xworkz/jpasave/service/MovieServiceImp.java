package com.xworkz.jpasave.service;

import com.xworkz.jpasave.entity.MovieEntity;
import com.xworkz.jpasave.repository.MovieRepository;
import com.xworkz.jpasave.repository.MovieRepositoryImp;

public class MovieServiceImp implements MovieService{

    MovieRepository movieRepository=new MovieRepositoryImp();
    @Override
    public String save(MovieEntity movieEntity) {
        System.out.println("Running Service");
        return movieRepository.save(movieEntity);
    }

    @Override
    public MovieEntity findById(int id) {
        System.out.println("findById method");
        return movieRepository.findById(id) ;
    }

    @Override
    public String updateNameByID(int id, String name) {
        System.out.println("updateNameByID method");
        return movieRepository.updateNameByID(id,name) ;
    }

    @Override
    public String deleteByID(int id) {
        System.out.println("deleteByID method");
        return movieRepository.deleteByID(id);
    }
}
