package com.CourseManagementSystem.myappvs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Eventservice {

    private Eventrepo eventRepository;

    @Autowired
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getEventsByDate(String date) {
        return eventRepository.findByDate(date);
    }
}
