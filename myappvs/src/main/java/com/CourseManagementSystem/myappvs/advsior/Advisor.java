package com.CourseManagementSystem.myappvs.advsior;


import com.CourseManagementSystem.myappvs.appointment.Appointment;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "advisors")
public class Advisor {
    
    @Id
    @Column(name = "advisor_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @Exclude
    @OneToMany(mappedBy = "advsior",fetch = FetchType.LAZY)
    private List<Appointment> appointments;
}
