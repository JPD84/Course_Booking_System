package com.codeClan.Course.Booking.Lab.Course.Booking.System;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository.BookingRepository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRespository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRespository courseRespository;

	@Autowired
	BookingRepository bookingRepository;


	@Test
	public void contextLoads() {
	}





}
