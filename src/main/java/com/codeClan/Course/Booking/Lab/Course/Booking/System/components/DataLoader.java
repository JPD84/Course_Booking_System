package com.codeClan.Course.Booking.Lab.Course.Booking.System.components;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Booking;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Course;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Customer;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository.BookingRepository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRespository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;

public class DataLoader {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRespository courseRespository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationRunner args){


        Customer customer1 = new Customer("Jean Grey", "Stirling", 32);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Scott Summers", "Oban", 33);
        customerRepository.save(customer2);

        Course course1 = new Course("Intro to Ruby", "Glasgow", 4);
        courseRespository.save(course1);
        Course course2 = new Course("Intro to Python", "Edinburgh", 5);
        courseRespository.save(course2);

        Booking booking1 = new Booking("07-05-2019");
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("14-05-2019");
        bookingRepository.save(booking2);
    }



}
