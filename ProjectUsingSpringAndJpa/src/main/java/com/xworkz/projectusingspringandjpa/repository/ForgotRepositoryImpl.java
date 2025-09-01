package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class ForgotRepositoryImpl implements ForgotRepository{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Spring_Project");

    @Override
    public boolean MailExits(ForgotDTO forgotDTO) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("SignUpEntity.existsByEmail");
            query.setParameter("email", forgotDTO.getEmail());
            Long count = (Long) query.getSingleResult();
            et.commit();
            return count != null && count > 0;

        } catch (Exception e) {
            System.out.println("Error checking email existence: " + forgotDTO.getEmail());
            if (et.isActive()) et.rollback();
        }
        finally {
            em.close();
        }
        return false;
    }
}
