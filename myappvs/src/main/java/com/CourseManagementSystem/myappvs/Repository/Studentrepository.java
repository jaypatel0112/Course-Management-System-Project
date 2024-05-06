package com.CourseManagementSystem.myappvs.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.myappvs.Model.Student;
import com.CourseManagementSystem.myappvs.Model.User;

public interface Studentrepository extends JpaRepository<Student, Long> {

}
