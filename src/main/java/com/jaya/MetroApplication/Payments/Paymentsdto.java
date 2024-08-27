package com.jaya.MetroApplication.Payments;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Paymentsdto {
 @Id
 private int id;
 private int bid;
  private int amount;
  private String status;

  
}
