package com.CourseManagementSystem.myappvs.rentals;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CourseManagementSystem.myappvs.user.User;


public interface EquipmentRepository extends JpaRepository <Equipment, Long> {
    
}