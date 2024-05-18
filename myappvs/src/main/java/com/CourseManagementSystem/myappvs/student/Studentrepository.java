package com.CourseManagementSystem.myappvs.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.myappvs.user.User;

public interface Studentrepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmailId(String emailId);
}
