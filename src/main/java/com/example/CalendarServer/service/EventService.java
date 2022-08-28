package com.example.CalendarServer.service;

import com.example.CalendarServer.entity.Event;

import java.util.Date;
import java.util.List;

public interface EventService {
    public Event saveEvent(Event event);

    public List<Event> getEvents();

    public Event fetchEventById(Long eventId);

    public void deleteEventById(Long eventId);
}
