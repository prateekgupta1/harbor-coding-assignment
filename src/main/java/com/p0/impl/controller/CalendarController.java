package com.p0.impl.controller;

import com.p0.impl.entities.Calendar;
import com.p0.impl.service.ICalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CalendarController {

    private final ICalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestParam Long userId, @RequestParam String name) {
        return calendarService.createCalendar(userId, name);
    }

    @GetMapping
    public List<Calendar> getCalendarsByUser(@RequestParam Long userId) {
        return calendarService.getCalendarsByUser(userId);
    }
}
