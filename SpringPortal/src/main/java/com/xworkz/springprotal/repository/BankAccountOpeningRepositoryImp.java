package com.xworkz.springprotal.repository;

import com.xworkz.springprotal.entity.BankAccountOpeningEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class BankAccountOpeningRepositoryImp implements BankAccountOpeningRepository{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Spring_Portal");

    @Override
    public String save(BankAccountOpeningEntity bankAccountOpeningEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(bankAccountOpeningEntity);
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
}
