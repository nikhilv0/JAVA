package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignInEntity;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class SignInRepositoryImp implements SignInRepository {

//    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Spring_Project");

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SignUpEntity getEntityByMail(String mail) {

        try {
            TypedQuery<SignUpEntity> query=entityManager.createNamedQuery("SignUpEntity.findByEmail", SignUpEntity.class);
            query.setParameter("email",mail);

            return query.getSingleResult();
        } catch (Exception e) {
            System.out.println("No record found for email: " + mail);
            return null;
        }
    }

    @Override
    public String login(SignInEntity signInEntity) {
        EntityTransaction et=entityManager.getTransaction();
        try {
            et.begin();
            entityManager.persist(signInEntity);
            et.commit();
            return "Login record saved!";
        }catch (Exception e){
            System.out.println("No record found to save");
            if (et.isActive()) et.rollback();
        }
        return "No record to save";
    }
}
