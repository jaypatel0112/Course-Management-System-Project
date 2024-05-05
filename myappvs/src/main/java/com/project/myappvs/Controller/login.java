package com.project.myappvs.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.project.myappvs.Model.Student;
import com.project.myappvs.Model.User;
import com.project.myappvs.Repository.Studentrepository;
import com.project.myappvs.Service.Loginservice;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@Slf4j
public class Login {

    @Autowired
    Loginservice loginservice;

    public Login(Loginservice loginService) {
        this.loginservice = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) throws Exception {

        String loginstudent;
        try {
            loginstudent = loginservice.login(user);
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
