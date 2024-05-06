package com.CourseManagementSystem.myappvs.Model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "Course_Description")
public class CourseDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private long courseId;

    private long instructorId;

    private String room;

    private Date date;

    private Time time;

    private String meetingInfo;

    private String materials;

    public CourseDescription() {
        // Default constructor required by Hibernate
    }

    public CourseDescription(long courseId, long instructorId, String room, Date date, Time time, String meetingInfo, String materials){
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.room = room;
        this.date = date;
        this.time = time;
        this.meetingInfo = meetingInfo;
        this.materials = materials;
    }

    public long getCourseId() { return courseId; }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public Date getDate() {
        return date;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public String getMaterials() {
        return materials;
    }

    public String getRoom() {
        return room;
    }

    public String getMeetingInfo() {
        return meetingInfo;
    }

    public Time getTime() {
        return time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public void setMeetingInfo(String meetingInfo) {
        this.meetingInfo = meetingInfo;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}