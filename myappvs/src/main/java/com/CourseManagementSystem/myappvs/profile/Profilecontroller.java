package com.CourseManagementSystem.myappvs.profile;

import com.CourseManagementSystem.myappvs.student.Student;
import com.CourseManagementSystem.myappvs.student.Studentrepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class Profilecontroller {

    @Autowired
    private Studentrepository studentRepository;

    @GetMapping
    public ResponseEntity<Map<String, Object>> showProfile(@RequestParam("emailId") String emailId) {
        Optional<Student> student = studentRepository.findByEmailId(emailId);
        if (student.isPresent()) {
            Student studentOp = student.get();
            // Construct a map to hold the profile data
            Map<String, Object> profileData = new HashMap<>();
            profileData.put("emailId", studentOp.getEmailId());
            profileData.put("name", studentOp.getName());
            profileData.put("studentIdNumber", studentOp.getStudentIdNumber());
            profileData.put("number", studentOp.getNumber());
            // Return the profile data as JSON response
            return ResponseEntity.ok(profileData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<Student> updateProfile(@RequestBody Student updatedStudent) {
        Optional<Student> existingStudent = studentRepository.findById(updatedStudent.getStudentIdNumber());
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            student.setName(updatedStudent.getName());
            student.setNumber(updatedStudent.getNumber());
            studentRepository.save(student);
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProfile(@RequestParam("emailId") String emailId) {
        Optional<Student> student = studentRepository.findByEmailId(emailId);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
