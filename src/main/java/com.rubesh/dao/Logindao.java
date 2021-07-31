package com.rubesh.dao;

import com.rubesh.beans.Userinfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Logindao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    EntityManager em = emf.createEntityManager();
    public List<Userinfo> getUser(){
        Query query = em.createQuery("select a from Userinfo  a");
        return (List<Userinfo>)query.getResultList() ;
    }
}
