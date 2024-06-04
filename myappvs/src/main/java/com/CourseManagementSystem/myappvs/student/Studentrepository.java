package com.CourseManagementSystem.myappvs.student;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmailId(String emailId);

    boolean existsByEmailId(String email);

    boolean existsByStudentIdNumber(Long studentIdNumber);
}