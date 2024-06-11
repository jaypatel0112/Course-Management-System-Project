package com.CourseManagementSystem.myappvs.advsior;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagementSystem.myappvs.appointment.Appointment;
import com.CourseManagementSystem.myappvs.appointment.AppointmentService;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {
    
    @Autowired
    private AppointmentService service;

    @GetMapping
    public List<Appointment> getAppointments(@RequestParam(name = "advisorId", required = true, defaultValue = "none") String advisorId){
        Long id = Long.parseLong(advisorId);
        return service.listByAdvisor(id);
    }
}
