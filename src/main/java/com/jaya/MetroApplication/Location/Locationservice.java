package com.jaya.MetroApplication.Location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.jaya.MetroApplication.profile.Profiledto;

@Service
public class Locationservice {
    @Autowired
    private Locationdao Dao;

    public Locationdto saveService(Locationdto locationdto){
        // String Locationname=locationdto.get
        // // return Dao.saveDao(locationdto);
        // List<Locationdto> list=Dao.findbyallname(Locationname);
        // if (!list.isEmpty()) {  
        //     System.out.println(Locationname+" already exist");
        //  else{
        //         System.out.println(Locationname+" not exists");
        //         return Dao.saveDaoLocation(Locationdto);
        //     }
            
        //     return Locationdto;
        // }
        return Dao.saveDao(locationdto);
    }

    public List<Locationdto> getallservice() {
        return Dao.getAllDao();
    }

    public Optional<Locationdto> getbyidservice(int id) {
        return Dao.getbyidDao(id);
    }

    public Optional<Locationdto> getbynameservice(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getbynameservice'");
    }

    
   
}
