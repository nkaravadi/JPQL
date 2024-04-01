package org.example;

import com.naga.jpa.domain.Basket;
import com.naga.jpa.domain.IndexEnt;
import com.naga.jpa.domain.IndexEnv;
import jakarta.persistence.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TEST");
        EntityManager em = emf.createEntityManager();

//        createData(em);

        em.createQuery("select i from IndexEnv i where i.indexEnt.indexComponents")
    }

    private static void createData(EntityManager em) {
        Basket b1 = new Basket("IBM.N", 11.1);
        Basket b2 = new Basket("AAPL.OQ", 22.2);
        IndexEnt idx  = new IndexEnt(".SPX", Arrays.asList(b1, b2));
        IndexEnv ie = new IndexEnv(1, idx);

        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(ie);
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}