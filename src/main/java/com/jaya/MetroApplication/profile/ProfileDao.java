package com.jaya.MetroApplication.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProfileDao {
    @Autowired
    private ProfileRepo profileRepo;

    public Profiledto saveDao(Profiledto profiledto) {
        return profileRepo.save(profiledto);
    }

    public List<Profiledto> getAllDao() {
        return profileRepo.findAll();
    }

    public Optional<Profiledto> getbyidDao(int id) {
        return profileRepo.findById(id);
    }


}
