package com.CourseManagementSystem.myappvs.courseCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enroll")
public class EnrollmentController {
    
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/enrollCourse")
    public ResponseEntity<?> enrollStudentInCourse(@RequestParam("emailId") String email, @RequestParam("courseId") Long courseId) {
        try {
            enrollmentService.enrollStudent(email, courseId);
            return ResponseEntity.ok("Enrollment Successful");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Enrollment Failed: " + e.getMessage());
        }
    }
    
    @GetMapping("/test3")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Endpoint is working");
    }

}
