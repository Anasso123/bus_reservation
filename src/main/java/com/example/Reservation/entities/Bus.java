package com.example.Reservation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // We annotate with id and the generatedValue IDENTITY it generates id automatically one by one
    private Long busId;
    // To rename the column name we use @Column(name = "nameOfColumnToRename")
    @Column(name = "bus_name")
    private String busName;
    private String busType;
    private Integer totalSeat;
    @Column(unique = true)
    private String busNumber;
}

// Spring data JPA create table it works with adding @Entity(name = "name of table") and
// you don't need to write sql commands