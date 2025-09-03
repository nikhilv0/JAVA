package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class ProfileRepositoryImp implements ProfileRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Spring_Project");

    @Override
    public List<SignUpEntity> getEntityByMail(String email) {
        EntityManager em= emf.createEntityManager();

        try {
            Query query=em.createNamedQuery("SignUpEntity.findByEmail");
            query.setParameter("email",email);
            return query.getResultList();

        } catch (Exception e) {
            System.out.println("No record found for email: " + email);
            return Collections.emptyList();
        }
        finally {
            em.close();
        }
    }
}
