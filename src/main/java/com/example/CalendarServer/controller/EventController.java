package com.example.CalendarServer.controller;

import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event saveEvent(@RequestBody Event event) {
        System.out.println(event);
        return eventService.saveEvent(event);
    }

    @GetMapping("/events")
    public List<Event> getEvents(){

        return eventService.getEvents();

    }
    @GetMapping("/events/{id}")
    public Event fetchEventById(@PathVariable("id") Long eventId) {
        return eventService.fetchEventById(eventId);
    }

    @DeleteMapping("/events/{id}")
    public String deleteEventById(@PathVariable("id") Long eventId){
        eventService.deleteEventById(eventId);
        return "Deleted Successfully";
    }

}
