package com.p0.impl.service;

import com.p0.impl.entities.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface IEventService {

    public Event createEvent(Long calendarId, String title, LocalDateTime startTime, LocalDateTime endTime);

    public List<Event> getEventsForCalendar(Long calendarId);

    public List<Event> getEventsBetweenTimes(LocalDateTime startTime, LocalDateTime endTime);
}
