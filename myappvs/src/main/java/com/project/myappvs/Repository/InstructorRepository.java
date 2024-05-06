package com.project.myappvs.Repository;

import com.project.myappvs.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
