package com.triptip.triptip.service;

import com.triptip.triptip.model.Destination;
import com.triptip.triptip.model.User;
import com.triptip.triptip.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository repository;
    public List<Destination> getDestinations(){
        return repository.findAll();
    }
    public List<Destination> getDestinationsByName(String name) {
        List <Destination> allDestinations = repository.findAll();
        List <Destination> newDestinations = new ArrayList<>();
        for(Destination dest : allDestinations){
            if(dest.getName().toLowerCase().contains(name.toLowerCase())){
                newDestinations.add(dest);
            }
        }
        return newDestinations;
    }
}
