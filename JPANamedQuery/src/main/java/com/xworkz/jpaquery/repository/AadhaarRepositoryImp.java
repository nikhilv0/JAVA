package com.xworkz.jpaquery.repository;

import com.xworkz.jpaquery.entity.AadhaarEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


public class AadhaarRepositoryImp implements AadhaarRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

    @Override
    public String save(AadhaarEntity aadhaarEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(aadhaarEntity);
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
    public List<AadhaarEntity> findbyall() {
        List<AadhaarEntity> result = null;
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {

            Query query = em.createNamedQuery("getAll");
            result =(List<AadhaarEntity>) query.getResultList();

        } catch (Exception e) {
        } finally {
            em.close();
        }
        return result;
    }

    @Override
    public AadhaarEntity getEntityByName(String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadhaarEntity aadhaarEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByName");
            query.setParameter("name", name);
            aadhaarEntity = (AadhaarEntity) query.getSingleResult();

            et.commit();
        } catch (Exception e) {
            System.out.println("No record found for name: " + name);
            if (et.isActive())
                et.rollback();
        }
        return aadhaarEntity;
    }

    @Override
    public AadhaarEntity getEntityByNameAndPlace(String name, String place) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadhaarEntity aadhaarEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByNameAndPlace");
            query.setParameter("name", name);
            query.setParameter("place", place);
            aadhaarEntity = (AadhaarEntity) query.getSingleResult();
            et.commit();
            return aadhaarEntity;

        } catch (Exception e) {
            System.out.println("No record found for name: " + name + "place: " + place);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public AadhaarEntity getEntityByNameAndPhoneNum(String name, Long number) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadhaarEntity aadhaarEntity = null;

        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByNameAndPhoneNum");
            query.setParameter("name", name);
            query.setParameter("phoneNumber", number);
            aadhaarEntity = (AadhaarEntity) query.getSingleResult();

            et.commit();
            return aadhaarEntity;
        } catch (Exception e) {
            System.out.println("No record found for name: " + name + "number: " + number);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public List<AadhaarEntity> getEntityByAge(int age) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<AadhaarEntity> aadhaarEntity = null;
        try {
            et.begin();

            Query query = em.createNamedQuery("getEntityByAge");
            query.setParameter("age", age);
            aadhaarEntity = (List<AadhaarEntity>) query.getResultList();
            et.commit();
            return aadhaarEntity;

        } catch (Exception e) {
            System.out.println("No record found for age: " + age);
            if (et.isActive())
                et.rollback();
        }
        return null;
    }

    @Override
    public List<AadhaarEntity> getEntityBtwAge(int minAge, int maxAge) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<AadhaarEntity> aadharEntities = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityBtwAge");
            query.setParameter("minAge",minAge);
            query.setParameter("maxAge",maxAge);
            aadharEntities=(List<AadhaarEntity>) query.getResultList();

            et.commit();
            return aadharEntities;
        } catch (Exception e) {
            System.out.println("No record found for age: " + minAge + "Between" + maxAge);
            if (et.isActive()) et.rollback();
        }

        return Collections.emptyList();
    }

    @Override
    public AadhaarEntity getEntityByEmail(String mail) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadhaarEntity aadhaarEntity = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityByEmail");
            query.setParameter("email",mail);
            aadhaarEntity =(AadhaarEntity) query.getSingleResult();

            et.commit();
            return aadhaarEntity;
        } catch (Exception e) {
            System.out.println("No record found for mail: " + mail );
            if (et.isActive()) et.rollback();
        }

        return null;
    }

    @Override
    public AadhaarEntity getEntityByPhoneNum(Long phoneNum) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        AadhaarEntity aadhaarEntity = null;
        try {
            et.begin();

            Query query=em.createNamedQuery("getEntityByPhoneNum");
            query.setParameter("phoneNumber",phoneNum);
            aadhaarEntity =(AadhaarEntity) query.getSingleResult();

            et.commit();
            return aadhaarEntity;
        } catch (Exception e) {
            System.out.println("No record found for Phone Number: " + phoneNum );
            if (et.isActive()) et.rollback();
        }

        return null;
    }

    @Override
    public AadhaarEntity getEmailAndPhoneNumByName(String name) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            et.begin();

            Query query=em.createNamedQuery("getEmailAndPhoneNumByName");
            query.setParameter("name",name);
//            aadhaarEntity = (AadhaarEntity) query.getSingleResult();
            Object[] objects=(Object[]) query.getSingleResult();

            AadhaarEntity aadhaarEntity =new AadhaarEntity();
            String email= (String) objects[0];
            aadhaarEntity.setEmail(email);

            Long phone= (Long) objects[1];
            aadhaarEntity.setPhoneNumber(phone);

            et.commit();
            return aadhaarEntity;
        }catch (Exception e){
            System.out.println("No record found for Name: " + name );
            if (et.isActive()) et.rollback();
        }

        finally {
            em.close();
        }
        return null;
    }

    @Override
    public AadhaarEntity getIdAndNameByNameAndPlace(String name, String place) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();

        try {
            et.begin();

            Query query=em.createNamedQuery("getIdAndNameByNameAndPlace");
            query.setParameter("name",name);
            query.setParameter("place",place);
            Object[] objects=(Object[]) query.getSingleResult();

            AadhaarEntity aadhaarEntity =new AadhaarEntity();
            int id= (int)objects[0];
            aadhaarEntity.setId(id);

            String name1=(String) objects[1];
            aadhaarEntity.setName(name1);

            et.commit();
            return aadhaarEntity;
        }catch (Exception e){
            System.out.println("No record found for Name: " + name + "Place: " +place );
            if (et.isActive()) et.rollback();
        }
        return null;
    }

    @Override
    public AadhaarEntity getPhoneNumAndPlaceByMail(String mail) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
            et.begin();

            Query query= em.createNamedQuery("getPhoneNumAndPlaceByMail");
            query.setParameter("email",mail);
            Object[] objects=(Object[]) query.getSingleResult();

            AadhaarEntity aadhaarEntity=new AadhaarEntity();
            Long phoneNum=(Long) objects[0];
            aadhaarEntity.setPhoneNumber(phoneNum);

            String place=(String) objects[1];
            aadhaarEntity.setPlace(place);
            et.rollback();

            return aadhaarEntity;
        }catch (Exception e){
            System.out.println("No record found for email: " + mail);
            if (et.isActive()) et.rollback();
        }
        return null;
    }
}
