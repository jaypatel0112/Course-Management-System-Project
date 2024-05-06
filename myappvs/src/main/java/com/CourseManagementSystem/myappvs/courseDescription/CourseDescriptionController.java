package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;
import com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDescriptionController {

    @Autowired
    private CourseDescriptionService courseDescriptionService;

    public CourseDescriptionController(CourseDescriptionService courseDescriptionService){
        this.courseDescriptionService = courseDescriptionService;
    }

    @GetMapping("/course-descriptions/{id}")
    public ResponseEntity<CourseDescription> getCourseDescriptionById(@PathVariable Long id)throws Exception {
        CourseDescription courseDescription = courseDescriptionService.getCourseDescriptionById(id);
        if (courseDescription != null) {
            return new ResponseEntity<CourseDescription>(courseDescription, HttpStatus.OK);
        } else {
            return new ResponseEntity<CourseDescription>(HttpStatus.NOT_FOUND);
        }
    }

}
