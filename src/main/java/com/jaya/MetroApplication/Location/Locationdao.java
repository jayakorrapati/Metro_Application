package com.jaya.MetroApplication.Location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.Query;

@Repository
public class Locationdao {
    @Autowired
    private LocationRepo locationRepo;

    public Locationdto saveDao(Locationdto locationdto) {
        return locationRepo.save(locationdto);
    }

    public List<Locationdto> getAllDao() {
        return locationRepo.findAll();
    }
 
    public Optional<Locationdto> getbyidDao(int id) {
        return locationRepo.findById(id);
    }

//     @Autowired
//     private EntityManager entitymanager;

// public List<Locationdto> findbyallname(String name){
//     Query q = entitymanager.createQuery("select a from Locationdto a where a.name=>?1");
//     q.setParameter(1, name);
//     return q.getResultList();
    
}




