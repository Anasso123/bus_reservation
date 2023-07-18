package com.example.Reservation.repos;

import com.example.Reservation.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

// We make an interface his name is BusRepository it extends JpaRepository
// We provide the Entity and the type of the primary key for the type of JpaRepository
public interface BusRepository extends JpaRepository<Bus,Long> {}
