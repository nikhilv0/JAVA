package com.xworkz.projectusingspringandjpa.repository;

import org.springframework.stereotype.Repository;
import javax.persistence.*;

@Repository
public class ForgotRepositoryImpl implements ForgotRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean mailExits(String email) {

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
}
