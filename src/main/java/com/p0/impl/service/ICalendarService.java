package com.p0.impl.service;

import com.p0.impl.entities.Calendar;

import java.util.List;

public interface ICalendarService {

    public Calendar createCalendar(Long userId, String name);

    public List<Calendar> getCalendarsByUser(Long userId);
}
