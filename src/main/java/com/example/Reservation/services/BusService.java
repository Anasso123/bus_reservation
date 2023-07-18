package com.example.Reservation.services;

import com.example.Reservation.entities.Bus;

import java.util.List;

public interface BusService {
    Bus addBus(Bus bus);
    List<Bus> getAllBus();
}
