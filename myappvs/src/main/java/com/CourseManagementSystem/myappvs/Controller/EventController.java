package com.CourseManagementSystem.myappvs.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagementSystem.myappvs.Service.Eventservice;
import com.CourseManagementSystem.myappvs.Model.Event;
import com.CourseManagementSystem.myappvs.Repository.Eventrepository;

@RestController
public class EventController {

    @Autowired
    private Eventservice eventService;

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @GetMapping("/events")
    public List<Event> getEventsByDate(@RequestBody Date date) {
        return eventService.getEventsByDate(date);
    }
}
