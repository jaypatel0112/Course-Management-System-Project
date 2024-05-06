package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseDescriptionRepository extends JpaRepository<CourseDescription, Long> {

    Optional<CourseDescription> findByCourseId(Long courseId);
}
