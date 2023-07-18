package com.example.Reservation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This T means that ResponseModel accept any type of entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModel<T> {
    private int statusCode;
    private String message;
    private T response;
}
