package com.CourseManagementSystem.myappvs.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, String> {

    Optional<User> findByEmailIdAndPassword(String emailId, String password);

}