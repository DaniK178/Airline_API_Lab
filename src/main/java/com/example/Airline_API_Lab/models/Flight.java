package com.example.Airline_API_Lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column (name = "destination")
    private String destination;

    @Column (name = "capacity")
    private int capacity;
    @Column (name = "departure_date")
    private long departureDate;

    @Column (name = "departure_time")
    private long departureTIme;

    @ManyToMany
    @JoinColumn (name ="passenger_id")
    @JsonIgnoreProperties ({"flights"})
    private Passenger passenger;

    public Flight(String destination, int capacity, long departureDate, long departureTIme, Passenger passenger) {
        this.destination = destination;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTIme = departureTIme;
        this.passenger = passenger;
    }

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(long departureDate) {
        this.departureDate = departureDate;
    }

    public long getDepartureTIme() {
        return departureTIme;
    }

    public void setDepartureTIme(long departureTIme) {
        this.departureTIme = departureTIme;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void addNewPassenger (Passenger passenger){
        this.passenger.add(passenger);
    }
}
