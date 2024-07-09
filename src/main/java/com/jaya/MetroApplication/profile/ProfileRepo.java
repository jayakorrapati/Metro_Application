package com.jaya.MetroApplication.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProfileRepo extends JpaRepository<Profiledto,Integer> {
    
}
