package com.project.myappvs.Service;

import com.project.myappvs.Model.Student;
import com.project.myappvs.Repository.Studentrepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import java.util.Optional;

@Component
public class Loginservice {

    @Autowired
    private Studentrepository studentRepository;

    public Loginservice(Studentrepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
     * public List<Student> getStudents() {
     * return studentRepository.findAll();
     * }
     */

    public String login(Student student) throws Exception {
        Optional<Student> student1 = studentRepository.findByEmailIdAndPassword(student.getEmailId(),
                student.getPassword());
        if (!student1.isPresent()) {
            throw new Exception("User does not exist please enter a valid username/password ");
        }

        return student.getName();
    }

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

}
