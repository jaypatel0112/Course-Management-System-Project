package com.CourseManagementSystem.myappvs.profile;

import com.CourseManagementSystem.myappvs.student.Student;
import com.CourseManagementSystem.myappvs.student.Studentrepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Profilecontroller {

    @Autowired
    private Studentrepository studentRepository;

    @GetMapping("/profile")
    public ResponseEntity<Map<String, Object>> showProfile(Model model, @RequestParam("emailId") String emailId) {
        // Check if user is authenticated
        if (emailId != null) {
            // User is authenticated, retrieve student data
            String email = (String) emailId;
            Optional<Student> student = studentRepository.findByEmailId(email);
            if (student.isPresent()) {
                Student studentOp = student.get();
                // Construct a map to hold the profile data
                Map<String, Object> profileData = new HashMap<>();
                profileData.put("emailId", emailId);
                profileData.put("name", studentOp.getName());
                profileData.put("studentIdNumber", studentOp.getStudentIdNumber());
                profileData.put("number", studentOp.getNumber());
                // Return the profile data as JSON response
                return ResponseEntity.ok(profileData);
            }

        } else {
            return ResponseEntity.notFound().build();
        }
        return null;
    }
}
