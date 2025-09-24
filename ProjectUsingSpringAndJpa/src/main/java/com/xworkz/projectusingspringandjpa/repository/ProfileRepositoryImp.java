package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class ProfileRepositoryImp implements ProfileRepository {

//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Spring_Project");

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SignUpEntity getEntityByMail(String email) {

        try {
            Query query=entityManager.createNamedQuery("SignUpEntity.findByEmail");
            query.setParameter("email",email);
            return (SignUpEntity) query.getSingleResult();

        } catch (Exception e) {
            System.out.println("No record found for email: " + email);
            return null;
        }
    }
}
