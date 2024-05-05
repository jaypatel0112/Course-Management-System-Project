package com.CourseManagementSystem.myappvs.Service;

import com.CourseManagementSystem.myappvs.Model.Student;
import com.CourseManagementSystem.myappvs.Model.User;
import com.CourseManagementSystem.myappvs.Repository.Studentrepository;
import com.CourseManagementSystem.myappvs.Repository.Userrepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import java.util.Optional;

@Component
public class Loginservice {

    @Autowired
    private Studentrepository studentRepository;

    @Autowired
    private Userrepository userRepository;

    public Loginservice(Studentrepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
     * public List<Student> getStudents() {
     * return studentRepository.findAll();
     * }
     */

    public String login(User user) throws Exception {
        User existingUser = userRepository.findByEmailIdAndPassword(user.getEmailId(), user.getPassword())
                .orElseThrow(() -> new Exception("Invalid credentials"));
        return existingUser.getStudent().getName();
    }

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

}
