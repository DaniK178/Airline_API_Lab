package com.example.Airline_API_Lab.controllers;

import com.example.Airline_API_Lab.models.Flight;
import com.example.Airline_API_Lab.models.Passenger;
import com.example.Airline_API_Lab.repositories.PassengerRepository;
import com.example.Airline_API_Lab.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value= "/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;


    @PostMapping
    public ResponseEntity<Passenger> addNewPassenger
            (@RequestBody Passenger passenger){
                Passenger savedPassenger =  passengerService.savePassenger(passenger);
                return new ResponseEntity<>(savedPassenger, HttpStatus.CREATED);
            }

    //    Display details of all passengers
    @GetMapping
    public ResponseEntity<List<Passenger>> displayAllPlayers(){
        List<Passenger> players = passengerService.displayAllPassengers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    //    Display details of a specific passenger
    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long id){
        Optional<Passenger> passenger = passengerService.getPassengerById(id);
        if (passenger.isPresent()){
            return new ResponseEntity<>(passenger.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


}
