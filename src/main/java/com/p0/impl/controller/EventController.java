package com.p0.impl.controller;

import com.p0.impl.entities.Event;
import com.p0.impl.service.IEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EventController {

    private IEventService calendarEventService;

    @PostMapping
    public Event createEvent(@RequestParam Long calendarId, @RequestParam String title,
                             @RequestParam LocalDateTime startTime, @RequestParam LocalDateTime endTime) {
        return calendarEventService.createEvent(calendarId, title, startTime, endTime);
    }

    @GetMapping("/calendar/{calendarId}")
    public List<Event> getEventsForCalendar(@PathVariable Long calendarId) {
        return calendarEventService.getEventsForCalendar(calendarId);
    }

    @GetMapping("/between")
    public List<Event> getEventsBetween(@RequestParam LocalDateTime startTime, @RequestParam LocalDateTime endTime) {
        return calendarEventService.getEventsBetweenTimes(startTime, endTime);
    }
}
