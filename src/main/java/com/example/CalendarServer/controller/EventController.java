package com.example.CalendarServer.controller;

import com.example.CalendarServer.entity.Event;
import com.example.CalendarServer.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

}
