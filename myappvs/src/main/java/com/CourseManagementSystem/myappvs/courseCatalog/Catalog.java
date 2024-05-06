package com.CourseManagementSystem.myappvs.courseCatalog;

import com.CourseManagementSystem.myappvs.instructor.Instructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name="Course_Catalog")
public class Catalog {
	
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String courseName;
	
	@Column(name="Course_Description")
	private String courseDesc;
	
	@ManyToOne
	@Column(name="Instructor_ID")
    @JoinColumn(name = "instructorId", referencedColumnName = "instructorId")
	private Instructor courseIns;  // Reference to Instructor entity
	
	@Column(name="Course_Credits")
	private int courseCredits;

}
