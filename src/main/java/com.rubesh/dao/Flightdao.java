package com.rubesh.dao;

import com.rubesh.beans.Flightinfo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Flightdao{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        public List<Flightinfo> getFlight(){
            Query query = em.createQuery("select b from Flightinfo  b");
            return query.getResultList() ;
        }
    public List<Integer> getFlightNo(){
        Query query = em.createQuery("select b.flightNo from Flightinfo  b");
        return (List<Integer>)query.getResultList() ;
    }
    }


