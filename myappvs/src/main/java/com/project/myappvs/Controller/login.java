package com.project.myappvs.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.project.myappvs.Model.Student;
import com.project.myappvs.Service.Loginservice;

@RestController
public class Login {

    @Autowired
    Loginservice loginservice;

    public Login(Loginservice loginService) {
        this.loginservice = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Student student) throws Exception {

        String loginstudent;
        try {
            loginstudent = loginservice.login(student);
        } catch (Exception exception) {
            throw exception;
        }

        return ResponseEntity.ok("Login successfully by " + loginstudent);

    }

    @PostMapping("/signup")
    public ResponseEntity<Student> signup(@RequestBody Student student) {
        Student saveStudent;
        try {
            saveStudent = loginservice.addStudent(student);
        } catch (RuntimeException exception) {
            throw exception;
        }
        return ResponseEntity.of(Optional.of(saveStudent));
    }
}
