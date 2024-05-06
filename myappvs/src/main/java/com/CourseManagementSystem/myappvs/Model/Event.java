package com.CourseManagementSystem.myappvs.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.sql.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Event {
    @Id
    private String id;
    private Date date;
    private String title;
    private String description;

    public Event(String id, Date date, String title, String description) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date2) {
        this.date = (Date) date2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
