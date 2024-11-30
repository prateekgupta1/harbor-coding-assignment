package com.p0.impl.service;

import com.p0.impl.entities.Availability;

import java.time.LocalDate;
import java.util.List;

public interface IAvailabilityService {

    void setAvailabilityForWeek(String username, List<Availability> availabilityList);

    public List<Availability> getAvailabilityForWeek(String username, LocalDate startOfWeek, LocalDate endOfWeek);

    public List<Availability> getAvailabilityForDay(String username, LocalDate date);

    public List<Availability> findOverlap(String user1, String user2, LocalDate date);

    }



