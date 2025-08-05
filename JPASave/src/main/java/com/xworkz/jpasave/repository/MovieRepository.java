package com.xworkz.jpasave.repository;

import com.xworkz.jpasave.entity.MovieEntity;

public interface MovieRepository {

    String save(MovieEntity movieEntity);

    MovieEntity findById(int id);

    String updateNameByID(int id, String name);

    String deleteByID(int id);
}
