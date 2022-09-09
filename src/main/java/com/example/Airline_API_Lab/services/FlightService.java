package com.example.Airline_API_Lab.services;

import com.example.Airline_API_Lab.models.Flight;
import com.example.Airline_API_Lab.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FlightService {

    @Autowired
    FlightRepository flightRepository;


    public List<Flight> displayAllFlights() {return flightRepository.findAll();
    }



}
