package com.codeClan.Course.Booking.Lab.Course.Booking.System;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Booking;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Course;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Customer;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository.BookingRepository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRespository;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void getAllCourses(){
		List<Course> found = courseRespository.getAllCourses("date");
		assertEquals("Intro to Ruby", found.get(0).getCourses());
	}

	@Test
	public void getAllBookings(){
		List<Booking> found = bookingRepository.getAllBookings("07-05-2019");
		assertEquals("07-05-2019", found.get(0).getCustomers());
	}

	@Test
	public void getAllCustomers(){
		List<Customer> found = customerRepository.getAllCustomers("Scott Summers");
		assertEquals("Scott Summers", found.get(0).getCustomers());
	}





}
