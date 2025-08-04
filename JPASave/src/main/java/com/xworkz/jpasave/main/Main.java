package com.xworkz.jpasave.main;

import com.xworkz.jpasave.entity.MovieEntity;
import com.xworkz.jpasave.service.MovieService;
import com.xworkz.jpasave.service.MovieServiceImp;

public class Main {
    public static void main(String[] args) {
        MovieEntity movieEntity=new MovieEntity(1,"ArjunReddy",500);
//        MovieEntity movieEntity1=new MovieEntity(2,"bahu",400);
        MovieService movieService=new MovieServiceImp();
        movieService.save(movieEntity);
//        movieService.save(movieEntity1);

    }
}
