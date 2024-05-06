package com.project.myappvs.Repository;

import com.project.myappvs.Model.CourseDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseDescriptionRepository extends JpaRepository<CourseDescription, Long> {

    @Override
    Optional<CourseDescription> findById(Long courseId);
}
