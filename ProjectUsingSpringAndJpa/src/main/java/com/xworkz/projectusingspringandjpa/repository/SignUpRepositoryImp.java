package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.dto.ForgotDTO;
import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class SignUpRepositoryImp implements SignUpRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Spring_Project");

    @Override
    public String save(SignUpEntity signUpEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.merge(signUpEntity);
            et.commit();
            return "Successfully Saved";
        } catch (Exception e) {
            System.out.println("No record found to save");
            if (et.isActive()) et.rollback();
        } finally {
            em.close();
        }
        return "No record saved";
    }

    @Override
    public boolean existsByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
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
        } finally {
            em.close();
        }
        return false;
    }

    @Override
    public SignUpEntity findByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query= em.createNamedQuery("SignUpEntity.findByEmail");
            query.setParameter("email",email);
            SignUpEntity signUpEntity=(SignUpEntity) query.getSingleResult();
            et.commit();
            return signUpEntity;
        }
        catch (Exception e){
            System.out.println("No record found for email: " + email);
            if (et.isActive()) et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

}
