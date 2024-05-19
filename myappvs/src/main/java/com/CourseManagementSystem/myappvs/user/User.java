package com.CourseManagementSystem.myappvs.user;

import com.CourseManagementSystem.myappvs.student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    private String emailId; // Primary key

    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentIdNumber")
    private Student student;

}
