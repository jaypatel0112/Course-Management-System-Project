package com.project.myappvs.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.myappvs.Model.Student;
import com.project.myappvs.Model.User;

public interface Studentrepository extends JpaRepository<Student, Long> {

    Optional<User> findByEmailIdAndPassword(String emailId, String password);

}
