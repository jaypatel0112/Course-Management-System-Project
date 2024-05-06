package com.CourseManagementSystem.myappvs.Repository;

import com.CourseManagementSystem.myappvs.Model.CourseDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseDescriptionRepository extends JpaRepository<CourseDescription, Long> {

    Optional<CourseDescription> findByCourseId(Long courseId);
}
