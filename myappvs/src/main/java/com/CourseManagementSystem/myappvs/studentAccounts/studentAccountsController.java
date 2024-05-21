package com.CourseManagementSystem.myappvs.studentAccounts;

import com.CourseManagementSystem.myappvs.courseDescription.CourseDescriptionDto;
import com.CourseManagementSystem.myappvs.studentAccounts.StudentAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/studentaccounts")
public class studentAccountsController {

    private StudentAccountService studentAccountService;

    public studentAccountsController(StudentAccountService studentAccountService) {
        this.studentAccountService = studentAccountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentAccountDto> getstudentAccountsbyId(@PathVariable Long id){

        try {
            StudentAccountDto studentAccountDto = studentAccountService.getStudentAccountsDetail(id);
            return ResponseEntity.ok(studentAccountDto);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Return 404 Not Found
        }
    }
}
