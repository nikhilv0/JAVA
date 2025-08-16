package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class SignUpRepositoryImp implements SignUpRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Spring_Project");
    @Override
    public String save(SignUpEntity signUpEntity) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
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
        return "Unsuccessful";
    }
}
