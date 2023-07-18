package com.example.Reservation.services;

import com.example.Reservation.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservations();

    List<Reservation> getReservationsByScheduleAndDepartureDate(Long scheduleId,String departureDate);
    List<Reservation> getReservationsByMobile(String mobile);
}
