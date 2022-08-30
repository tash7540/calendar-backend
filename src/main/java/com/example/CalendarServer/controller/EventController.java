package com.example.CalendarServer.controller;

import com.example.CalendarServer.error.EventNotFoundException;
import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event saveEvent(@Valid @RequestBody Event event) {
        System.out.println(event);
        return eventService.saveEvent(event);
    }

    @GetMapping("/events")
    public List<Event> getEvents(){

        return eventService.getEvents();

    }
    @GetMapping("/events/{id}")
    public Event fetchEventById(@PathVariable("id") Long eventId) throws EventNotFoundException {
        return eventService.fetchEventById(eventId);
    }

    @DeleteMapping("/events/{id}")
    public String deleteEventById(@PathVariable("id") Long eventId){
        eventService.deleteEventById(eventId);
        return "Deleted Successfully";

    }

    @PatchMapping("/events/{id}")
    public Event updateEvent(@PathVariable("id") Long eventId, @RequestBody Event event){
        System.out.println(event);

        return eventService.updateEvent(eventId,event);
    }

}
