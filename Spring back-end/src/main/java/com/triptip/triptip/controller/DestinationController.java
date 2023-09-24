package com.triptip.triptip.controller;

import com.triptip.triptip.model.Destination;
import com.triptip.triptip.model.User;
import com.triptip.triptip.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin ("http://localhost:3000")
public class DestinationController {
    @Autowired
    private DestinationService service;
    @GetMapping("/")
    public String home(){
        return "Home";
    }
    @GetMapping("/destinations")
    public List<Destination> findAllDestinations(){
        return service.getDestinations();
    }
    @GetMapping("/destinations/{name}")
    public List<Destination> findDestinations(@PathVariable String name) {
        return service.getDestinationsByName(name);
    }



}
