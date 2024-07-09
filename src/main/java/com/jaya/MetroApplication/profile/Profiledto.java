package com.jaya.MetroApplication.profile;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profiledto {
    @Id
    private int id;
    private int age;
    private int mobile ;
    private String gender;
    

}
