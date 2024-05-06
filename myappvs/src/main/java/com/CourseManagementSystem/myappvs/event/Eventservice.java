package com.CourseManagementSystem.myappvs.event;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
public class Eventservice {
    @Autowired
    private Eventrepository eventRepository;

    public Event saveEvent(@RequestBody Event event) {
        // Example validation: Ensure event title is not empty
        if (event.getTitle() == null || event.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Event title cannot be empty");
        }

        return eventRepository.save(event);
    }

    public List<Event> getEventsByDate(Date date) {
        return eventRepository.findByDate(date);
    }

}
