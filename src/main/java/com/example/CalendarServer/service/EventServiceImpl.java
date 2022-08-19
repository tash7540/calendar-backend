package com.example.CalendarServer.service;

import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);

    }

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }
}