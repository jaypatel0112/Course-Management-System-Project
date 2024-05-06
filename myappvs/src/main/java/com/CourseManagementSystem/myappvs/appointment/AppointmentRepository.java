package com.CourseManagementSystem.myappvs.appointment;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.CourseManagementSystem.myappvs.advsior.Advisor;
import com.CourseManagementSystem.myappvs.student.Student;



public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    
    List<Appointment> findAllByAdvsior(Advisor advsior);

    List<Appointment> findAllByStudent(Student student);

}
