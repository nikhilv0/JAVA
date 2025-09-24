package com.xworkz.projectusingspringandjpa.repository;

import com.xworkz.projectusingspringandjpa.entity.SignUpEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Optional;

@Repository
public class SignUpRepositoryImp implements SignUpRepository {

//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Spring_Project");

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public String save(SignUpEntity signUpEntity) {
        EntityTransaction et = entityManager.getTransaction();

        try {
            et.begin();
            entityManager.merge(signUpEntity);
            et.commit();
            return "Successfully Saved";
        } catch (Exception e) {
            System.out.println("No record found to save");
            if (et.isActive()) et.rollback();
        }
        return "No record saved";
    }

    @Override
    public boolean existsByEmail(String email) {
        try {
            Query query = entityManager.createNamedQuery("SignUpEntity.existsByEmail");
            query.setParameter("email", email);
            Long count = (Long) query.getSingleResult();

            return count != null && count > 0;

        } catch (Exception e) {
            System.out.println("Error checking email existence: " + email);
        }
        return false;
    }

    @Override
    public Optional<SignUpEntity> findByEmail(String email) {

        try {
            TypedQuery<SignUpEntity> query = entityManager.createNamedQuery("SignUpEntity.findByEmail", SignUpEntity.class);
            query.setParameter("email", email);
            SignUpEntity signUpEntity = query.getSingleResult();

            return Optional.of(signUpEntity);
        } catch (Exception e) {
            System.out.println("No record found for email: " + email);
        }
        return Optional.empty();
    }

    @Override
    public SignUpEntity isValidToken(String token) {

        try {

            Query query = entityManager.createNamedQuery("findEntityByToken");
            query.setParameter("resetToken", token);

            return (SignUpEntity) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("No record found for resetToken: " + token);

            return null;
        }
    }
}
