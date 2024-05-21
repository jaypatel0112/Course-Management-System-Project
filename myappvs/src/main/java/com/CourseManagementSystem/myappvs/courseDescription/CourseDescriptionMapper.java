package com.CourseManagementSystem.myappvs.courseDescription;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;

public class CourseDescriptionMapper {
    public static com.CourseManagementSystem.myappvs.courseDescription.CourseDescription maptoCourseDescription(CourseDescriptionDto courseDescriptionDto){
        com.CourseManagementSystem.myappvs.courseDescription.CourseDescription courseDescription = new com.CourseManagementSystem.myappvs.courseDescription.CourseDescription(
                courseDescriptionDto.getCourseDescriptionId(),
                courseDescriptionDto.getCourseId(),
                courseDescriptionDto.getInstructorId(),
                courseDescriptionDto.getRoom(),
                courseDescriptionDto.getDate(),
                courseDescriptionDto.getTime(),
                courseDescriptionDto.getMeetingInfo(),
                courseDescriptionDto.getMaterials()
        );
        return courseDescription;
    }
    public static CourseDescriptionDto maptoCourseDescriptionDto(CourseDescription courseDescription){
        CourseDescriptionDto courseDescriptionDto = new CourseDescriptionDto(
                courseDescription.getCourseDescriptionId(),
                courseDescription.getCourseId(),
                courseDescription.getInstructorId(),
                courseDescription.getRoom(),
                courseDescription.getDate(),
                courseDescription.getTime(),
                courseDescription.getMeetingInfo(),
                courseDescription.getMaterials()
        );
        return courseDescriptionDto;
    }
}
