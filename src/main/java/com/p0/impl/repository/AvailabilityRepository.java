package com.p0.impl.repository;

import com.p0.impl.entities.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Long> {

    List<Availability> findByUser_EmailAndDateBetween(String email, LocalDate startDate, LocalDate endDate);
    List<Availability> findByUser_EmailAndDate(String email, LocalDate date);
}
