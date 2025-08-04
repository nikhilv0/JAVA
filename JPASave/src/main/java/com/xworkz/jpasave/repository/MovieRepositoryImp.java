package com.xworkz.jpasave.repository;

import com.xworkz.jpasave.entity.MovieEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieRepositoryImp implements MovieRepository{
    @Override
    public MovieEntity save(MovieEntity movieEntity) {
        System.out.println("Running Repsository");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            em.persist(movieEntity);
            et.commit();
            System.out.println("stored Successfully");

        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }

        try {
            et.begin();

            MovieEntity movieEntity1=em.find(MovieEntity.class,1);
            System.out.println("FInd movie By ID: "+movieEntity1.getId()+"Movie Name: "+movieEntity1.getMovieName()+"Movie price: "+movieEntity1.getPrice());

        }catch (Exception e){
        if (et.isActive()) et.rollback();
        }

        try {
            et.begin();

            MovieEntity movieEntity2=em.find(MovieEntity.class,1);
            movieEntity2.setMovieName("Arjun Reddy 2");
            movieEntity2.setPrice(999);
            System.out.println("updated data"+movieEntity2.getMovieName()+movieEntity2.getPrice());

            et.commit();
        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }

        finally {
            em.close();
        }

        return null;
    }
}
