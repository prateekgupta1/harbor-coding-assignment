package com.p0.impl.service.impl;

import com.p0.impl.entities.Availability;
import com.p0.impl.service.IAvailabilityService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AvailabilityServiceImpl implements IAvailabilityService {
    @Override
    public void setAvailabilityForWeek(String username, List<Availability> availabilityList) {

    }

    @Override
    public List<Availability> getAvailabilityForWeek(String username, LocalDate startOfWeek, LocalDate endOfWeek) {
        return null;
    }

    @Override
    public List<Availability> getAvailabilityForDay(String username, LocalDate date) {
        return null;
    }

    @Override
    public List<Availability> findOverlap(String user1, String user2, LocalDate date) {
        return null;
    }
}
