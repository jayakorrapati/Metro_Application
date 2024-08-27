package com.jaya.MetroApplication.Location;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Locationdto {
 @Id
 private int id;
private String stationname;
private int distance;
public List<Locationdto> findById(int startingStation) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
}
}
