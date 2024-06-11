package com.CourseManagementSystem.myappvs.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

import com.CourseManagementSystem.myappvs.advsior.Advisor;
import com.CourseManagementSystem.myappvs.student.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString.Exclude;

@Data
@AllArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private long id;

    @Exclude
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentIdNumber")
    private Student student;
    
    @Exclude
    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @Temporal(TemporalType.DATE)
    private LocalDate appointmentDate;

    @Temporal(TemporalType.TIME)
    private LocalTime appointmentTime;

    private String appointmentNote;
}
