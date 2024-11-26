package com.p0.impl.repository;

import com.p0.impl.entities.Calendar;
import com.p0.impl.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

    List<Calendar> findByUser(User user);
}
