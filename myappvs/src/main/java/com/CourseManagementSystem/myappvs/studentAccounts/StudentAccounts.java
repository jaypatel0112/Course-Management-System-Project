package com.CourseManagementSystem.myappvs.studentAccounts;

import com.CourseManagementSystem.myappvs.student.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString.Exclude;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Accounts")
public class StudentAccounts {

    @Id
    @Column(unique = true)
    private Long studentAccountsId;

    @Exclude
    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentIdNumber")
    private Student studentId;

    private double balance;

}
