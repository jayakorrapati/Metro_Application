package com.jaya.MetroApplication.Payments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// import com.jaya.MetroApplication.bookings.BookingsRepo;
// import com.jaya.MetroApplication.bookings.Bookingsdto;


    @Repository
public class Paymentsdao {
    @Autowired
    private PaymentsRepo payRepo;

    public Paymentsdto saveDao(Paymentsdto paydto){
        return payRepo.save(paydto);
    }
    public List<Paymentsdto> getAllDao() {
        return payRepo.findAll();
    }

    public Optional<Paymentsdto> getbyidDao(int id) {
        return payRepo.findById(id);
    }


     

}


