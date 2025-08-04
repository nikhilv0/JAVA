package com.xworkz.jpasave.service;

import com.xworkz.jpasave.entity.MovieEntity;
import com.xworkz.jpasave.repository.MovieRepository;
import com.xworkz.jpasave.repository.MovieRepositoryImp;

public class MovieServiceImp implements MovieService{
    @Override
    public MovieEntity save(MovieEntity movieEntity) {
        System.out.println("Running Service");
        MovieRepository movieRepository=new MovieRepositoryImp();
        return movieRepository.save(movieEntity);
    }
}
