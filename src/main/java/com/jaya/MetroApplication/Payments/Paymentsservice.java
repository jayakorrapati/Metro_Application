package com.jaya.MetroApplication.Payments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaya.MetroApplication.QR.QRCodeGeneration;
import com.jaya.MetroApplication.bookings.BookingsRepo;
import com.jaya.MetroApplication.bookings.Bookingsdto;


// import com.jaya.MetroApplication.bookings.BookingsDao;
// import com.jaya.MetroApplication.bookings.BookingsRepo;
// import com.jaya.MetroApplication.Location.Locationdto;
// import com.jaya.MetroApplication.bookings.BookingsDao;


    @Service   
    public class Paymentsservice {
    @Autowired
    private Paymentsdao dao;
   @Autowired
   private BookingsRepo bookrepo;
   @Autowired
   private QRCodeGeneration qRCodeGeneration;
   
     public Paymentsdto saveService(Paymentsdto paydto){
        if(paydto.getStatus().equalsIgnoreCase("Success")){
            qRCodeGeneration.generateQRCode(paydto.toString());
            return dao.saveDao(paydto);
        }
      Optional<Bookingsdto> b =bookrepo.findById(paydto.getBid());
      paydto.setAmount(b.get().getFare());
    return paydto;

    }

    public List<Paymentsdto> getallservice() {
        return dao.getAllDao();
    }

    public Optional<Paymentsdto> getbyidservice(int id) {
        return dao.getbyidDao(id);
    }
}

