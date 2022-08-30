package com.example.CalendarServer.service;

import com.example.CalendarServer.error.EventNotFoundException;
import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public Event fetchEventById(Long eventId) throws EventNotFoundException {
        Optional<Event> event =
                eventRepository.findById(eventId);

        if(!event.isPresent()) {
            throw new EventNotFoundException("Event Not Found");
        }

        return  event.get();
    }

    @Override
    public void deleteEventById(Long eventId) {
        eventRepository.deleteById(eventId);
    }

    @Override
    public Event updateEvent(Long eventId, Event event) {
        Event eventDB = eventRepository.findById(eventId).get();

        if(Objects.nonNull(event.getEventName()) &&
                !"".equalsIgnoreCase(event.getEventName())) {
            eventDB.setEventName(event.getEventName());
        }

        if(Objects.nonNull(event.getEventTime())) {
            eventDB.setEventTime(event.getEventTime());
        }

        if(Objects.nonNull(event.getEventNote()) &&
                !"".equalsIgnoreCase(event.getEventNote())) {
            eventDB.setEventNote(event.getEventNote());
        }
        return eventRepository.save(eventDB);

    }


}
