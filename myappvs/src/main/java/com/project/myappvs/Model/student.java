package com.project.myappvs.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    private String name;

    private String emailId;

    @Column(nullable = false)
    private String password;

    private String number;

    @Id
    @Column(unique = true)
    private Long studentIdNumber;

    public Student() {
    }

    public Student(String name, String emailId, String password, String number, Long studentIdNumber) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.number = number;
        this.studentIdNumber = studentIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(String studentIdNumber) {
        this.studentIdNumber = Long.parseLong(studentIdNumber);
    }

}
