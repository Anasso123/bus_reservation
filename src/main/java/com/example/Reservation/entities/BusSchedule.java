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
@Entity
@Table(name = "bus_schedule")
public class BusSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "bus_id")
    private Bus bus;
    @OneToOne
    @JoinColumn(name = "bus_route_id")
    private BusRoute busRoute;
    private String departureTime;
    private Integer ticketPrice;
    private Integer discount;
    private Integer processingFee;
}

// OneToOne = The BusSchedule is the One and bus table is the One
// OneToMany = The BusSchedule is the One and have too many bus
// @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
// In case when we need to delete :
// CascadeType.Delete : when we need to delete bus it delete also the joined table
// CascadeType.ALL : It will Persist delete... by default it's CascadeType.ALL
// CascadeType.NONE : remove the table without removing the table associated
