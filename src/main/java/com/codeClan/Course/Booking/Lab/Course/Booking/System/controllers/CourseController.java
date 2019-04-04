package com.codeClan.Course.Booking.Lab.Course.Booking.System.controllers;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Course;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CourseRepository.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRespository courseRespository;

    @GetMapping
    public List<Course>getAllCourses(){
        return courseRespository.findAll();
    }

}
