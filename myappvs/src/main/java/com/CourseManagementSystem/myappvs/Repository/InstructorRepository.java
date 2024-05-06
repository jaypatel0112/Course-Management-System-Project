package com.CourseManagementSystem.myappvs.Repository;

import com.CourseManagementSystem.myappvs.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
