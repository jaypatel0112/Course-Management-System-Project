package com.project.myappvs.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.myappvs.Model.Student;
import com.project.myappvs.Service.Loginservice;

public class Login {
    Loginservice loginservice;

    public Login(Loginservice loginService) {
        this.loginservice = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody Student user) {
        Boolean username;
        try {
            username = loginservice.login(user);
        } catch (Exception exception) {
            throw exception;
        }

        return ResponseEntity.ok(username);
    }
}
