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
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("kingdom");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();

        List<KingdomEntity> kingdom=new ArrayList<>(Arrays.asList(new KingdomEntity(1,"nikki","nikitha"),new KingdomEntity(2,"aryan","megha")));
        for (KingdomEntity kingdom1:kingdom){
//        em.persist(kingdom1);
            em.remove(kingdom1);
        }

//        KingdomEntity kingdomEntity=em.find(k.class);

        et.commit();
        em.close();

    }
}
