package com.CourseManagementSystem.myappvs.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.myappvs.Model.User;

public interface Userrepository extends JpaRepository<User, String> {

    Optional<User> findByEmailIdAndPassword(String emailId, String password);

}