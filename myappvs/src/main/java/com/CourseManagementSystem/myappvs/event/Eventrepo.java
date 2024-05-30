package com.CourseManagementSystem.myappvs.event;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Eventrepo extends MongoRepository<Event, String> {
    List<Event> findByDate(String date);
}
