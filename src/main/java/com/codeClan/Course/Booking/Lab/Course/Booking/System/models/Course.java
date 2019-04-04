package com.codeClan.Course.Booking.Lab.Course.Booking.System.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "starRating")
    private int starRating;

    @OneToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private List<Course>courses;

    public Course(String name, String location, int starRating, List<Course> courses) {
        this.name = name;
        this.location = location;
        this.starRating = starRating;
        this.courses = courses;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
