package com.jaya.MetroApplication.bookings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookingsDao {
    @Autowired
    private BookingsRepo bookingsRepo;

    public Bookingsdto saveDao(Bookingsdto bookingsdto){
        return bookingsRepo.save(bookingsdto);
    }
    public List<Bookingsdto> getAllDao() {
        return bookingsRepo.findAll();
    }

    public Optional<Bookingsdto> getbyidDao(int id) {
        return bookingsRepo.findById(id);
    }


     
    

}
