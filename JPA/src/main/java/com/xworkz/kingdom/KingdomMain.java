package com.xworkz.kingdom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KingdomMain {
    public static void main(String[] args) {
        // Save opertion
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("kingdom");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        try {
        et.begin();

        List<KingdomEntity> kingdom=new ArrayList<>(Arrays.asList(new KingdomEntity(1,"nikki","nikitha"),new KingdomEntity(2,"aryan","megha")));
        for (KingdomEntity kingdom1:kingdom){
        em.persist(kingdom1);
            System.out.println("Data is Saved");
        }
        et.commit();
        }catch (Exception e){
            if (et.isActive()){
                et.rollback();
            }
        }

//
        // Read
        try {
            et.begin();

            KingdomEntity kingdomEntity=em.find(KingdomEntity.class,2);
            if (kingdomEntity!=null){
                System.out.println("Id:" +kingdomEntity.getId()+"King Name:" +kingdomEntity.getKingName()+"Quuen Name:"+kingdomEntity.getQueenName());
            }else {
                System.out.println("Id is not present");
            }
        }catch (Exception e){
            if (et.isActive())
                et.rollback();
        }


        //update
        try {
            et.begin();

//            KingdomEntity kingdomEntity=new KingdomEntity();
//            kingdomEntity.setId(2);
//            kingdomEntity.setKingName("Katta");
//            kingdomEntity.setQueenName("Devasena");
//
//            em.merge(kingdomEntity);
//            et.commit();
//            System.out.println("updated Successfull");

            KingdomEntity kingdomEntity=em.find(KingdomEntity.class,2);
            kingdomEntity.setKingName("Katta");
            kingdomEntity.setQueenName("Devasena");
            System.out.println("Entity updated successfully.");

            et.commit();

        }catch (Exception e){
            if (et.isActive())et.rollback();
        }


        finally {
            em.close();
        }


    }
}
