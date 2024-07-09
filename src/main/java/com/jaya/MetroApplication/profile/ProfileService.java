package com.jaya.MetroApplication.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private ProfileDao dao;

    public Profiledto saveService(Profiledto profiledto){
return dao.saveDao(profiledto);
    }

    public List<Profiledto> getallservice(){
        return dao.getAllDao();
    }

    public Optional<Profiledto> getbyidservice(int id){
        return dao.getbyidDao(id);
    }


   

}
