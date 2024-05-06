package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;
import com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CourseDescriptionService {

    @Autowired
    private CourseDescriptionRepository courseDescriptionRepository;

    public CourseDescriptionService(CourseDescriptionRepository courseDescriptionRepository){
        this.courseDescriptionRepository = courseDescriptionRepository;
    }


    public CourseDescription getCourseDescriptionById(Long id) throws Exception {
        Optional<CourseDescription> optionalCourseDescription = courseDescriptionRepository.findByCourseId(id);

        if(!optionalCourseDescription.isPresent()){
            throw new Exception("Course with " +id+" does not exist");
        }
        return optionalCourseDescription.orElse(null);
    }

}
