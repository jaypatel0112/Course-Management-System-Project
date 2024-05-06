package com.CourseManagementSystem.myappvs.studentAccounts;

import com.CourseManagementSystem.myappvs.studentAccounts.StudentAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAccountsRepository extends JpaRepository<StudentAccounts, Long> {
}
