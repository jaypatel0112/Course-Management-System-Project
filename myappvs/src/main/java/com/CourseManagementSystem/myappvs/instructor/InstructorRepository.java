package com.CourseManagementSystem.myappvs.instructor;

import com.CourseManagementSystem.myappvs.instructor.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
