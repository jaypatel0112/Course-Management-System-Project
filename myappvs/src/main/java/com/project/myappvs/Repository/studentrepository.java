package com.project.myappvs.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.myappvs.Model.Student;

public interface Studentrepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmailIdAndPassword(String emailId, String password);

}
