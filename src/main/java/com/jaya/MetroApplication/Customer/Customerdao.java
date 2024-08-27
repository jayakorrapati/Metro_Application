package com.jaya.MetroApplication.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// import com.jaya.MetroApplication.bookings.BookingsRepo;
// import com.jaya.MetroApplication.bookings.Bookingsdto;

@Repository
public class Customerdao {
    @Autowired

    private CustomerRepo customerrRepo;

    public Customerdto saveDao(Customerdto customerrdto){
        return customerrRepo.save(customerrdto);
    }
    public List<Customerdto> getAllDao() {
        return customerrRepo.findAll();
    }

    public Optional<Customerdto> getbyidDao(int id) {
        return customerrRepo.findById(id);
    }

}
