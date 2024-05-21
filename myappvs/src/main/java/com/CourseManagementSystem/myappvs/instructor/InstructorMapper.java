package com.CourseManagementSystem.myappvs.instructor;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescription;
import com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionDto;

public class InstructorMapper {
    public static Instructor maptoInstructor(InstructorDto instructorDto){
        Instructor instructor= new Instructor(
                instructorDto.getInstructorId(),
                instructorDto.getInstructorName(),
                instructorDto.getInstructorDescription(),
                instructorDto.getMeetingHours(),
                instructorDto.getInstructorCabinLocation()
        );
        return instructor;
    }
    public static InstructorDto maptoInstructorDto(Instructor instructor){
        InstructorDto instructorDto= new InstructorDto(
                instructor.getInstructorId(),
                instructor.getInstructorName(),
                instructor.getInstructorDescription(),
                instructor.getMeetingHours(),
                instructor.getInstructorCabinLocation()
        );
        return instructorDto;
    }

}
