package com.example.CalendarServer.service;

import com.example.CalendarServer.error.EventNotFoundException;
import com.example.CalendarServer.entity.Event;

import java.util.List;

public interface EventService {
    public Event saveEvent(Event event);

    public List<Event> getEvents();

    public Event fetchEventById(Long eventId) throws EventNotFoundException;

    public void deleteEventById(Long eventId);

    public Event updateEvent(Long eventId, Event event);
}
