package com.jaya.MetroApplication.Customer;

// import com.jaya.MetroApplication.bookings.Bookingsdto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customerdto {
    @Id
    private int id;
    private String name;
   

}
