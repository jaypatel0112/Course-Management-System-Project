/**
 * This Package consists of Two Entities : a) Catalog 
 * 1.Catalog Entity:
 * This entity represents the table storing all the Courses and its respective information to be displayed to students for them to be able to enroll.
 * 
 * 2.Catalog Controller
 * This is the controller class which is responsible to get the requests and display the Courses in the courseCatalog page. It displays a table.
 * 
 * 3.Course Service
 * THis is the service class where I make use of the repository to write the logic to fetch the data and return it.
 * 
 * 4.Course Repository
 * This is the JPA Repository class which is used to retrieve the course_catalog table information from the H2 DataBase
 * 
 * b)Enrollment
 * 1.Enrollment Entity:
 * This represents the table storing all the enrollments per student for each enrolled course
 * 
 * 2.Enrollment Repository
 * This is the JPA Repository class responsible to communicate with enrollment table in the Database.
 * 
 * 3.Enrollment Service
 * Service class the fetch student, catalog object and insert an enrollment record into the enrollment table after student enrolls particular course
 * 
 * 4.Enrollment Controller
 * Receives the request to post the enrollment of a student.
 * <li>One to one relationship between student and user.
 * 
 * 
 * @author Puneeth Talluri
 */
package com.CourseManagementSystem.myappvs.courseCatalog;
