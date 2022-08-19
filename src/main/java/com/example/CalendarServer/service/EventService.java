package com.example.CalendarServer.service;

import com.example.CalendarServer.entity.Event;

import java.util.List;

public interface EventService {
    public Event saveEvent(Event event);

    public List<Event> getEvents();
}
