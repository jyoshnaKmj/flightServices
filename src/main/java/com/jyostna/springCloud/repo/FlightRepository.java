package com.jyostna.springCloud.repo;

import org.springframework.data.repository.CrudRepository;

import com.jyostna.springCloud.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {

}
