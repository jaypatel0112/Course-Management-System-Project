package com.CourseManagementSystem.myappvs.appointment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseManagementSystem.myappvs.student.Student;


@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepo;

    public List<Appointment> listByStudent(Student student) {
        List<Appointment> appointments = appointmentRepo.findAllByStudent(student);
        return appointments;
    }

    public List<Appointment> listByAdvisor(Long advisorId) {
        List<Appointment> appointments = appointmentRepo.findByAdvisorId(advisorId);
        return appointments;
    }

    public Appointment save(Appointment appointment) {
        appointmentRepo.save(appointment);
        return appointment;
    }

    public void delete(long id) {
        appointmentRepo.deleteById(id);
    }
}
