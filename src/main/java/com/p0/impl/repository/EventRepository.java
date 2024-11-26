package com.p0.impl.repository;

import com.p0.impl.entities.Calendar;
import com.p0.impl.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByCalendar(Calendar calendar);
    List<Event> findByStartTimeBetween(LocalDateTime startTime, LocalDateTime endTime);
}
