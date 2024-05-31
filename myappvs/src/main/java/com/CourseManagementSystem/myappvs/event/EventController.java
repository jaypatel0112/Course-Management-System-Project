package com.CourseManagementSystem.myappvs.event;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    private Eventrepo eventRepository;

    @GetMapping("/events/{date}")
    public List<Event> getEventsByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return eventRepository.findByDate(date);
    }

    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
