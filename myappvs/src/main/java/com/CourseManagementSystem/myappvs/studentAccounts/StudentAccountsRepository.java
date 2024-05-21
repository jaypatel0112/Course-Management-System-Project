package com.CourseManagementSystem.myappvs.studentAccounts;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentAccountsRepository extends JpaRepository<StudentAccounts, Long> {
    Optional<StudentAccounts> findByStudentId_studentIdNumber(Long studentId);



}
