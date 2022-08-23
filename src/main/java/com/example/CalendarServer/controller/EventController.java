package com.example.CalendarServer.controller;

import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
