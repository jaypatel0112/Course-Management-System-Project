package com.CourseManagementSystem.myappvs.courseCatalog;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CourseManagementSystem.myappvs.student.Student;
import com.CourseManagementSystem.myappvs.student.Studentrepository;
import jakarta.persistence.EntityManager;

@Service
public class EnrollmentService {

    @Autowired
    private Studentrepository studentRepo;

    @Autowired
    private EnrollmentRepository repo;

    @Autowired
    private CatalogRepository catalogRepo;

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void enrollStudent(String email, Long courseId) {
        entityManager.clear();
        Optional<Student> op1 = studentRepo.findByEmailId(email);
        Student student = op1.get();
        System.out.println(student);

        Optional<Catalog> opt2 = catalogRepo.findById(courseId);
        Catalog course = opt2.get();
        System.out.println(course);

        boolean enrollmentExists = repo.findByStudent_StudentIdNumberAndCatalog_CourseId(student.getStudentIdNumber(), course.getCourseId()).isPresent();
        if (enrollmentExists) {
            throw new RuntimeException("Enrollment already exists");
        }

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCatalog(course);
        enrollment.toString();

        System.out.println(enrollment);
        repo.save(enrollment);
    }

    public Long getStudentId(String email) {
        Optional<Student> s = studentRepo.findByEmailId(email);
        Student x = s.get();
        long id = x.getStudentIdNumber();
        return id;
    }

    public void addSudentEnrollement(Enrollment current) {
        repo.save(current);
    }

    public List<Enrollment> getAllEnrollments() {
        return repo.findAll();
    }

    public List<Enrollment> getStudentEnrollment(String email) {
        Long id = getStudentId(email);
        return repo.findByStudent_StudentIdNumber(id);
    }

    @Transactional
    public void deleteEnrollmentById(Long id) {
        Optional<Enrollment> enrollmentOpt = repo.findById(id);
        if (enrollmentOpt.isPresent()) {
            Enrollment enrollment = enrollmentOpt.get();
            enrollment.setStudent(null); // Break relationship
            enrollment.setCatalog(null); // Break relationship
            repo.delete(enrollment);
        }
    }
}
