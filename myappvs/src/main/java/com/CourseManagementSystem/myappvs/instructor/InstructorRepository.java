package com.CourseManagementSystem.myappvs.instructor;

import com.CourseManagementSystem.myappvs.instructor.Instructor;
import com.CourseManagementSystem.myappvs.studentAccounts.StudentAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Optional<Instructor> findByInstructorId(Long instructorId);
}
