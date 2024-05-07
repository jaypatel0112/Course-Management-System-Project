package com.CourseManagementSystem.myappvs.instructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

@Entity
@Table(name = "Instructor")
public class Instructor {

    @Id
    @Column(unique = true)
    private long instructorId;

    private String instructorName;

    private String instructorDescription;

    private Time meetingHours;

    private String instructorCabinLocation;

    public Instructor(){

    }

    public Instructor(long instructorId, String instructorName, String instructorDescription, Time meetingHours, String instructorCabinLocation){
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorDescription = instructorDescription;
        this.meetingHours = meetingHours;
        this.instructorCabinLocation = instructorCabinLocation;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorCabinLocation() {
        return instructorCabinLocation;
    }

    public String getInstructorDescription() {
        return instructorDescription;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public Time getMeetingHours() {
        return meetingHours;
    }

    public void setInstructorCabinLocation(String instructorCabinLocation) {
        this.instructorCabinLocation = instructorCabinLocation;
    }

    public void setInstructorDescription(String instructorDescription) {
        this.instructorDescription = instructorDescription;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setMeetingHours(Time meetingHours) {
        this.meetingHours = meetingHours;
    }
}
