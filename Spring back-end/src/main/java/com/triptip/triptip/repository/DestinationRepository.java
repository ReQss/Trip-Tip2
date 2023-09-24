package com.triptip.triptip.repository;

import com.triptip.triptip.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DestinationRepository extends JpaRepository<Destination,Integer> {
    List <Destination> findByName(String name);
}
