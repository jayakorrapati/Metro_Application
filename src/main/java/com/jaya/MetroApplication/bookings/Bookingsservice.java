package com.jaya.MetroApplication.bookings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaya.MetroApplication.Location.LocationRepo;
import com.jaya.MetroApplication.Location.Locationdto;

@Service
public class Bookingsservice {
    @Autowired
    private BookingsDao Dao;
    
    @Autowired
    private LocationRepo locationRepo;

    public Bookingsdto saveservice(Bookingsdto bookingsdto) {
    //     int rupeesPerKm = 5,sum=0;
    //     int Seats = bookingsdto.getSeats();
    //     int startingStation = bookingsdto.getLocationdto().getId();//1
    //     int endingStation = bookingsdto.getLocationdto1().getId();//3
        
    //     for (int i = startingStation; i <=endingStation; i++) {
    //         Optional<Locationdto> end = locationRepo.findById(i);
    //         int Stationdistance = end.get().getDistance();
    //         sum+=Stationdistance;
    //     }

    //    int fare = (sum * rupeesPerKm) * Seats;
    //     bookingsdto.setFare(fare);
        return Dao.saveDao(bookingsdto);
                
    }
      

    public List<Bookingsdto> getallservice() {
        return Dao.getAllDao();
    }

    public Optional<Bookingsdto> getbyidservice(int id) {
        return Dao.getbyidDao(id);
    }

}
