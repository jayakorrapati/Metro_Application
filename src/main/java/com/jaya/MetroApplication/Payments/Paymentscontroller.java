package com.jaya.MetroApplication.Payments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.jaya.MetroApplication.Customer.Customerdto;
// import com.jaya.MetroApplication.Customer.Customerservice;


@RestController
@RequestMapping("/payments")
public class Paymentscontroller {
    @Autowired
    private Paymentsservice payservice;

    @PostMapping("/save")
    public Paymentsdto saveController(@RequestBody Paymentsdto paydto) {
        return payservice.saveService(paydto);
    }

    @GetMapping("/all")
    public List<Paymentsdto> getallControl() {
        return payservice.getallservice();
    }

    @GetMapping("/{id}")
    
    public Optional<Paymentsdto> getbyidControl(@PathVariable int id) {
        return payservice.getbyidservice(id);
    }

}



