package com.xworkz.jpasave.repository;

import com.xworkz.jpasave.entity.MovieEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieRepositoryImp implements MovieRepository{
    @Override
    public String save(MovieEntity movieEntity) {
        System.out.println("Running Repsository");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            em.persist(movieEntity);
            et.commit();

        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return "Saved Successfully";
    }

    @Override
    public MovieEntity findById(int id) {

        System.out.println("FindBy ID:"+id);
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();

        try {
            return em.find(MovieEntity.class,id);
        }catch (Exception e){
        }
        finally {
            em.close();
        }
        return null;
    }

    @Override
    public String updateNameByID(int id, String name) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            et.begin();

            MovieEntity movieEntity=em.find(MovieEntity.class,id);
            movieEntity.setMovieName(name);
            em.merge(movieEntity);

            et.commit();

        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return "successfully updated";
    }

    @Override
    public String deleteByID(int id) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            et.begin();

            MovieEntity movieEntity=em.find(MovieEntity.class,id);
            em.remove(movieEntity);

            et.commit();

        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return "successfully deleted";
    }
}
