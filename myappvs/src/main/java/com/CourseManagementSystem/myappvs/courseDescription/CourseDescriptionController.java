package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseCatalog.Catalog;
import com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coursedescription")
public class CourseDescriptionController {

    private com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionService courseDescriptionService;

    public CourseDescriptionController(CourseDescriptionService courseDescriptionService) {
        this.courseDescriptionService = courseDescriptionService;
    }

    //Get CourseDetails Rest Api
    @GetMapping("/{id}")
    public ResponseEntity<CourseDescriptionDto> getCourseDescriptionbyId(@PathVariable Long id){

    try {
        CourseDescriptionDto courseDescriptionDto = courseDescriptionService.getCourseDetail(id);
        return ResponseEntity.ok(courseDescriptionDto);
    } catch (RuntimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Return 404 Not Found
    }
}
}
