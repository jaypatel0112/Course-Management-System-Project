package com.CourseManagementSystem.myappvs.user;

import com.CourseManagementSystem.myappvs.student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
    @Id
    private String emailId; // Primary key

    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentIdNumber")
    private Student student;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter method for the student field
    public Student getStudent() {
        return student;
    }

    // Setter method for the student field
    public void setStudent(Student student) {
        this.student = student;
    }
}
