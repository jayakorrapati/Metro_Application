package com.jaya.MetroApplication.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {
@Autowired
    private ProfileService profileService;
    
    @PostMapping("/save")
    public Profiledto saveController(@RequestBody Profiledto profiledto){
return profileService.saveService(profiledto);
    }

    @GetMapping("/all")
    public List<Profiledto> getallControl(){
        return profileService.getallservice();
    }

    @GetMapping("/{id}")
    public Optional<Profiledto> getbyidControl(@PathVariable int id){
        return profileService.getbyidservice(id);
    }

    

}
