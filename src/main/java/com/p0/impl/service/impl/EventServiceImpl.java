package com.p0.impl.service.impl;

import com.p0.impl.entities.Calendar;
import com.p0.impl.entities.Event;
import com.p0.impl.repository.CalendarRepository;
import com.p0.impl.repository.EventRepository;
import com.p0.impl.service.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.validation.ValidationException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements IEventService {

    private final EventRepository eventRepository;

    private final CalendarRepository calendarRepository;
    @Override
    public Event createEvent(Long calendarId, String title, LocalDateTime startTime, LocalDateTime endTime) {
        Calendar calendar = calendarRepository.findById(calendarId)
                .orElseThrow(() -> new RuntimeException("Calendar not found"));

        if (startTime.isAfter(endTime)) {
            throw new ValidationException("Start time must be before end time");
        }

        Event event = new Event();
        event.setTitle(title);
        event.setStartTime(startTime);
        event.setEndTime(endTime);
        event.setCalendar(calendar);

        return eventRepository.save(event);
    }

    @Override
    public List<Event> getEventsForCalendar(Long calendarId) {
        Calendar calendar = calendarRepository.findById(calendarId)
                .orElseThrow(() -> new RuntimeException("Calendar not found"));
        return eventRepository.findByCalendar(calendar);
    }

    @Override
    public List<Event> getEventsBetweenTimes(LocalDateTime startTime, LocalDateTime endTime) {
        return eventRepository.findByStartTimeBetween(startTime, endTime);
    }
}
