package com.CourseManagementSystem.myappvs.studentAccounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAccountService {

    private StudentAccountsRepository studentAccountsRepository;

    @Autowired
    public StudentAccountService(StudentAccountsRepository studentAccountsRepository) {
        this.studentAccountsRepository = studentAccountsRepository;
    }


    public StudentAccountDto getStudentAccountsDetail(Long studentId) {
        StudentAccounts studentAccounts= studentAccountsRepository
                .findByStudentId_studentIdNumber(studentId)
                .orElseThrow(()-> new RuntimeException("Student Doesn't Exist"));
        return StudentAccountsMapper.maptoStudentAccountDto(studentAccounts);
    }
}
