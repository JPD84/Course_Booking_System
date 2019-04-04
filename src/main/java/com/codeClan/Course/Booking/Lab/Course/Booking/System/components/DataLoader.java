package com.codeClan.Course.Booking.Lab.Course.Booking.System.components;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository.BookingRepository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRespository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DataLoader {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRespository courseRespository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }



}
