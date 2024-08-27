package com.jaya.MetroApplication.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.jaya.MetroApplication.bookings.Bookingsdto;

// import com.jaya.MetroApplication.bookings.Bookingsdto;

// import com.jaya.MetroApplication.bookings.BookingsDao;
// import com.jaya.MetroApplication.bookings.Bookingsdto;
@Service
public class Customerservice {
    @Autowired
    private Customerdao Dao;

     public Customerdto saveservice(Customerdto custodto) {
        return Dao.saveDao(custodto);
}
    public List<Customerdto> getallservice() {
            return Dao.getAllDao();
        }
    public Optional<Customerdto> getbyidservice(int id) {
            return Dao.getbyidDao(id);
        }

}