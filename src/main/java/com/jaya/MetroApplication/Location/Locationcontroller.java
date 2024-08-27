package com.jaya.MetroApplication.Location;

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
@RequestMapping("/Location")
public class Locationcontroller {
    @Autowired
    private Locationservice ls;

    @PostMapping("/save")
    public Locationdto saveController(@RequestBody Locationdto locationdto) {
        return ls.saveService(locationdto);
    }

    @GetMapping("/all")
    public List<Locationdto> getallControl() {
        return ls.getallservice();
    }

    @GetMapping("/{jaya}")
    public Optional<Locationdto> getbyidControl(@PathVariable int id) {
        return ls.getbyidservice(id);
    }
    @GetMapping("/{akhi}")
    public Optional<Locationdto> getbynameControl(@PathVariable String name) {
        return ls.getbynameservice(name);


    }

}
