package com.CourseManagementSystem.myappvs.courseCatalog;

import com.CourseManagementSystem.myappvs.student.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString.Exclude;

@Data
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Enrollment {
	
    @Id
    @Column(unique = true, name="Enrollment_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Exclude
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentIdNumber")
    private Student student;
    
    @Exclude
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Catalog catalog;
    
    

}