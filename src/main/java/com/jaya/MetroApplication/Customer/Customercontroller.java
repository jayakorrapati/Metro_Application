package com.jaya.MetroApplication.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.jaya.MetroApplication.bookings.Bookingsdto;
// import com.jaya.MetroApplication.bookings.Bookingsservice;


@RestController
@RequestMapping("/Customer")
public class Customercontroller {
    @Autowired
    private Customerservice customerrservice;

    @PostMapping("/save")
    public Customerdto saveController(@RequestBody Customerdto customerrdto) {
        return customerrservice.saveservice(customerrdto);
    }

    @GetMapping("/all")
    public List<Customerdto> getallControl() {
        return customerrservice.getallservice();
    }

    @GetMapping("/{id}")
    public Optional<Customerdto> getbyidControl(@PathVariable int id) {
        return customerrservice.getbyidservice(id);
    }

}

