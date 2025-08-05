package com.xworkz.jpasave.main;

import com.xworkz.jpasave.entity.MovieEntity;
import com.xworkz.jpasave.service.MovieService;
import com.xworkz.jpasave.service.MovieServiceImp;

public class Main {
    public static void main(String[] args) {
        MovieEntity movieEntity=new MovieEntity(1,"ArjunReddy",500);

        MovieService movieService=new MovieServiceImp();
        String save=movieService.save(movieEntity);


        MovieEntity movieEntity2=movieService.findById(1);
        System.out.println(movieEntity2.toString());

       String updated= movieService.updateNameByID(2,"aryan");
       System.out.println(updated);

        String deleted= movieService.deleteByID(2);
        System.out.println(deleted);

//        MovieEntity movieEntity4=new MovieEntity(2,"bahu",400);
//        String save1=movieService.save(movieEntity4);
//        System.out.println(save+" "+save1);
    }
}
