package com.example.Airline_API_Lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

public class Passenger {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = " name")
    private String name;

    @Column (name = "phone_number")
    private Long phoneNumber;

    @ManyToMany
    @JoinColumn(name ="flight_id")
    @JsonIgnoreProperties({"passenger"})
    private Flight flight;

    public Passenger(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Passenger() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addNewPassenger(Passenger passenger{this.pa})
}
