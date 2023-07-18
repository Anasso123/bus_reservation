package com.example.Reservation.services.impl;

import com.example.Reservation.entities.Bus;
import com.example.Reservation.repos.BusRepository;
import com.example.Reservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {
    // To inject the interface we use @Autowired
    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
