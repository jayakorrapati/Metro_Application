package com.jaya.MetroApplication.bookings;

import com.jaya.MetroApplication.Customer.Customerdto;
import com.jaya.MetroApplication.Location.Locationdto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Bookingsdto {
   @Id
   private int id;
   // private String startstation;
   // private String endstation;
   private int amount;
   private int seats;
   private String status;
   private int offerid;
   
   
   @OneToOne
   @JoinColumn(name = "Customer")
   private Customerdto customerrdto;
   @ManyToOne
   @JoinColumn(name = "startingStation")
   private Locationdto locationdto;

@ManyToOne
@JoinColumn(name = "endingStation")
private Locationdto locationdto1;

private int fare;

}
