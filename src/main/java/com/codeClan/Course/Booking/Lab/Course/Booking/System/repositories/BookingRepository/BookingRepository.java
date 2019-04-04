package com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.BookingRepository;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking>getAllBookings(String booking);
}
