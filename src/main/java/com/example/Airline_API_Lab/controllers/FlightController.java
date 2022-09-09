package com.example.Airline_API_Lab.controllers;

import com.example.Airline_API_Lab.models.Flight;
import com.example.Airline_API_Lab.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "flights")
public class FlightController {

    @Autowired
    FlightService flightService;

//    Add details of a new flight
//    Display all available flights
//    Display details of a specific flight
//    Add a new passenger

//    Book a passenger on to a flight
//    Cancel a flight



    @GetMapping
    public ResponseEntity<List<Flight>> displayAllFlights(){
        List<Flight> flights = flightService.displayAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id){
        Optional<Flight> flight = flightService.getFlightById(id);
        if (flight.isPresent()){
            return new ResponseEntity<>(flight.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }




}
