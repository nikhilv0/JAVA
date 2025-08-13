package com.xworkz.springandjpa.repository;

import com.xworkz.springandjpa.dto.SignUpDTO;
import com.xworkz.springandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class SignUpRepositoryImp implements SignUpRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("SpringAndJpa");
    @Override
    public String save(SignUpEntity signUpEntity) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            em.persist(signUpEntity);
            et.commit();
            return "Successfully Saved";
        }catch (Exception e){
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return null;
    }
}
