package com.CourseManagementSystem.myappvs.studentAccounts;


import com.CourseManagementSystem.myappvs.student.Student;
import jakarta.persistence.*;
import lombok.ToString.Exclude;

@Entity
@Table(name = "student_accounts")
public class StudentAccounts {

    @Id
    @Column(unique = true)
    private Long studentAccountsId;

    @Exclude
    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentIdNumber")
    private Student student;


    private double balance;


    public StudentAccounts(){

    }

    public StudentAccounts(long studentAccountsId, Student student, double balance){
        this.studentAccountsId = studentAccountsId;
        this.student = student;
        this.balance = balance;
    }

    public void setStudentId(Student student) {
        this.student = student;
    }

    public long getStudentAccountsId() {
        return studentAccountsId;
    }

    public void setStudentAccountsId(long studentAccountsId) {
        this.studentAccountsId = studentAccountsId;
    }

    public Student getStudent() {
        return student;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
