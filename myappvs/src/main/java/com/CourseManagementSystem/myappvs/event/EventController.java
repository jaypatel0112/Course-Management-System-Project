package com.CourseManagementSystem.myappvs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private Eventrepo eventRepository;

    // Get events by date
    @GetMapping("/{date}")
    public List<Event> getEventsByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return eventRepository.findByDate(date);
    }

    // Create a new event
    @PostMapping
    public Event createEvent(@Validated @RequestBody Event event) {
        return eventRepository.save(event);
    }

    // Update an event
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable String id, @Validated @RequestBody Event eventDetails) {
        Event event = eventRepository.findById(id)
                .orElseThrow();

        event.setDate(eventDetails.getDate());
        event.setEventName(eventDetails.getEventName());
        event.setOrganizerName(eventDetails.getOrganizerName());

        final Event updatedEvent = eventRepository.save(event);
        return ResponseEntity.ok(updatedEvent);
    }

    // Delete an event
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable String id) {
        Event event = eventRepository.findById(id)
                .orElseThrow();

        eventRepository.delete(event);
        return ResponseEntity.ok().build();
    }

    // Get all events
    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}