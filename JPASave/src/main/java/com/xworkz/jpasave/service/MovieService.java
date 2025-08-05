package com.xworkz.jpasave.service;

import com.xworkz.jpasave.entity.MovieEntity;

public interface MovieService {

    String save(MovieEntity movieEntity);

    MovieEntity findById(int id);

    String updateNameByID(int id,String name);

    String deleteByID(int id);
}
