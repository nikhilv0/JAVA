package com.xworkz.jpaquery.repository;

import com.xworkz.jpaquery.entity.AadharEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


public class AadharRepositoyImp implements AadharRepositoy {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

    @Override
    public String save(AadharEntity aadharEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(aadharEntity);
            et.commit();
            return "Successfully saved";
        } catch (Exception e) {
            if (et.isActive()) et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<AadharEntity> findbyall() {
        List<AadharEntity> result = null;
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {

            Query query = em.createNamedQuery("getAll");
            result = query.getResultList();

        } catch (Exception e) {
        } finally {
            em.close();
        }
        return result;
    }

    @Override
    public AadharEntity getEntityByName(String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadharEntity aadharEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByName");
            query.setParameter("name", name);
            aadharEntity = (AadharEntity) query.getSingleResult();

            et.commit();
        } catch (Exception e) {
            System.out.println("No record found for name: " + name);
            if (et.isActive())
                et.rollback();
        }
        return aadharEntity;
    }

    @Override
    public AadharEntity getEntityByNameAndPlace(String name, String place) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadharEntity aadharEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByNameAndPlace");
            query.setParameter("name", name);
            query.setParameter("place", place);
            aadharEntity = (AadharEntity) query.getSingleResult();
            et.commit();
            return aadharEntity;

        } catch (Exception e) {
            System.out.println("No record found for name: " + name + "place: " + place);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public AadharEntity getEntityByNameAndPhoneNum(String name, Long number) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadharEntity aadharEntity = null;

        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByNameAndPhoneNum");
            query.setParameter("name", name);
            query.setParameter("phoneNumber", number);
            aadharEntity = (AadharEntity) query.getSingleResult();

            et.commit();
            return aadharEntity;
        } catch (Exception e) {
            System.out.println("No record found for name: " + name + "number: " + number);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public List<AadharEntity> getEntityByAge(int age) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<AadharEntity> aadharEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByAge");
            query.setParameter("age", age);
            aadharEntity = (List<AadharEntity>) query.getResultList();
            et.commit();
            return aadharEntity;

        } catch (Exception e) {
            System.out.println("No record found for age: " + age);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public List<AadharEntity> getEntityBtwAge(int minAge, int maxAge) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<AadharEntity> aadharEntities = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityBtwAge");
            query.setParameter("minAge",minAge);
            query.setParameter("maxAge",maxAge);
            aadharEntities=(List<AadharEntity>) query.getResultList();

            et.commit();
            return aadharEntities;
        } catch (Exception e) {
            System.out.println("No record found for age: " + minAge + "Between" + maxAge);
            if (et.isActive()) et.rollback();
        }

        return Collections.emptyList();
    }

    @Override
    public AadharEntity getEntityByEmail(String mail) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadharEntity aadharEntity = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityByEmail");
            query.setParameter("email",mail);
            aadharEntity=(AadharEntity) query.getSingleResult();

            et.commit();
            return aadharEntity;
        } catch (Exception e) {
            System.out.println("No record found for mail: " + mail );
            if (et.isActive()) et.rollback();
        }

        return null;
    }

    @Override
    public AadharEntity getEntityByPhoneNum(Long phoneNum) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadharEntity aadharEntity = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityByPhoneNum");
            query.setParameter("phoneNumber",phoneNum);
            aadharEntity=(AadharEntity) query.getSingleResult();

            et.commit();
            return aadharEntity;
        } catch (Exception e) {
            System.out.println("No record found for Phone Number: " + phoneNum );
            if (et.isActive()) et.rollback();
        }

        return null;
    }
}
