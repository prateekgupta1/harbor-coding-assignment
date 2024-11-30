package com.p0.impl.service.impl;

import com.p0.impl.entities.Calendar;
import com.p0.impl.entities.User;
import com.p0.impl.repository.CalendarRepository;
import com.p0.impl.repository.UserRepository;
import com.p0.impl.service.ICalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalendarServiceImpl implements ICalendarService {

    private final CalendarRepository calendarRepository;

    private final UserRepository userRepository;
    @Override
    public Calendar createCalendar(Long userId, String name) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        Calendar calendar = new Calendar();
        calendar.setName(name);
        calendar.setOwner(user);

        return calendarRepository.save(calendar);
    }

    @Override
    public List<Calendar> getCalendarsByUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return calendarRepository.findByUser(user);
    }
}
