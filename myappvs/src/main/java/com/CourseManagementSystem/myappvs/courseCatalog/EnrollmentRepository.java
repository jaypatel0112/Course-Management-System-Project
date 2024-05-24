package com.CourseManagementSystem.myappvs.courseCatalog;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{

	Optional<Enrollment> findByStudent_StudentIdNumberAndCatalog_CourseId(Long studentIdNumber, Long courseId);
}
