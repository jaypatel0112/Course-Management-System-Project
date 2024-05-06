package com.CourseManagementSystem.myappvs.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CourseManagementSystem.myappvs.Model.Event;

@Repository
public interface Eventrepository extends MongoRepository<Event, String> {
    List<Event> findByDate(Date date);
}
