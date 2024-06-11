package com.CourseManagementSystem.myappvs.appointment;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.CourseManagementSystem.myappvs.advsior.Advisor;
import com.CourseManagementSystem.myappvs.student.Student;



public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    
    List<Appointment> findAllByAdvisor(Advisor advisor);

    List<Appointment> findAllByStudent(Student student);

    // List<Appointment> findByStudentId(long studentId);

    List<Appointment> findByAdvisorId(long id);
}
