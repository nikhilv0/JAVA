package com.xworkz.projectusingspringandjpa.repository;

import org.springframework.stereotype.Repository;
import javax.persistence.*;

@Repository
public class ForgotRepositoryImpl implements ForgotRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Spring_Project");

    @Override
    public boolean mailExits(String email) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("SignUpEntity.existsByEmail");
            query.setParameter("email", email);
            Long count = (Long) query.getSingleResult();
            et.commit();
            return count != null && count > 0;

        } catch (Exception e) {
            System.out.println("Error checking email existence: " + email);
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return false;
    }
}
