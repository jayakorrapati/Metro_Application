package com.jaya.MetroApplication.bookings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bookings")
public class Bookingscontroller {
    @Autowired
    private Bookingsservice bookingsservice;

    @PostMapping("/save")
    public Bookingsdto saveController(@RequestBody Bookingsdto bookingsdto) {
        return bookingsservice.saveservice(bookingsdto);
    }

    @GetMapping("/all")
    public List<Bookingsdto> getallControl() {
        return bookingsservice.getallservice();
    }

    @GetMapping("/{id}")
    public Optional<Bookingsdto> getbyidControl(@PathVariable int id) {
        return bookingsservice.getbyidservice(id);
    }

}
