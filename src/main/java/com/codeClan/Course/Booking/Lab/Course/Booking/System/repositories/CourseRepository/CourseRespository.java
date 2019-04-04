package com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Booking;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRespository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Booking>getAllCourses(String course);
}
