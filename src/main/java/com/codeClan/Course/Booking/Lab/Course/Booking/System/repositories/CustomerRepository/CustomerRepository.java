package com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Customer;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CourseRepositoryCustom {
    List<Customer>getAllCustomers(String customer);


}
