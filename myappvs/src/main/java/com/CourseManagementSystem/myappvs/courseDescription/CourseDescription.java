package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseCatalog.Catalog;
import com.CourseManagementSystem.myappvs.instructor.Instructor;
import jakarta.persistence.*;
import lombok.ToString.Exclude;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "Course_Description")
public class CourseDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long courseDescriptionId;

    @Exclude
    @OneToOne
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Catalog courseId;

    @Exclude
    @ManyToOne
    @JoinColumn(name = "instructorId", referencedColumnName = "instructorId")
    private Instructor instructorId;

    private String room;

    private Date date;

    private Time time;

    private String meetingInfo;

    private String materials;

    public CourseDescription() {
        // Default constructor required by Hibernate
    }

    public CourseDescription(long courseDescriptionId, Instructor instructorId, String room, Date date, Time time, String meetingInfo, String materials){
        this.courseDescriptionId = courseDescriptionId;
        this.instructorId = instructorId;
        this.room = room;
        this.date = date;
        this.time = time;
        this.meetingInfo = meetingInfo;
        this.materials = materials;
    }

    public long getCourseId() { return courseDescriptionId; }

    public void setCourseId(long courseId) {
        this.courseDescriptionId = courseId;
    }

    public Date getDate() {
        return date;
    }

    public Instructor getInstructorId() {
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

    public void setInstructorId(Instructor instructorId) {
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
