package com.example.Airline_API_Lab.services;

import com.example.Airline_API_Lab.models.Passenger;
import com.example.Airline_API_Lab.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public List<Passenger> displayAllPassengers(){
        return passengerRepository.findAll();
    }

    public Optional<Passenger> getPassengerById (Long id){
        return passengerRepository.findById(id);}
    }

