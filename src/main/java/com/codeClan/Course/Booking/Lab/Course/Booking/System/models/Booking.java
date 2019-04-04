package com.codeClan.Course.Booking.Lab.Course.Booking.System.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "date")
    private String date;

    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private List<Customer> customers;
    private List<Course> courses;

    public Booking(String date, List<Customer> customers, List<Course> courses) {
        this.date = date;
        this.customers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
