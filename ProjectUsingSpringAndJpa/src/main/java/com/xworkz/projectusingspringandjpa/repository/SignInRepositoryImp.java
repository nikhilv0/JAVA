package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class SignInRepositoryImp implements SignInRepository {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Spring_Project");

    @Override
    public SignUpEntity getEntityByMail(String mail) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {

            TypedQuery<SignUpEntity> query=em.createNamedQuery("SignUpEntity.findByEmail", SignUpEntity.class);
            query.setParameter("email",mail);
            return query.getSingleResult();

        } catch (Exception e) {
            System.out.println("No record found for email: " + mail);
            if (et.isActive()) et.rollback();
            return null;
        }
        finally {
            em.close();
        }
    }

    @Override
    public String login(SignInEntity signInEntity) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try {
            et.begin();
            em.persist(signInEntity);
            et.commit();
            return "Login record saved!";
        }catch (Exception e){
            System.out.println("No record found to save");
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return "No record to save";
    }
}
