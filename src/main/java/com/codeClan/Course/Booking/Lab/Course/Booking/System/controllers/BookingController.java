package com.codeClan.Course.Booking.Lab.Course.Booking.System.controllers;


import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Booking;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public List<Booking>getAllBookings(){
        return bookingRepository.findAll();
    }
}
