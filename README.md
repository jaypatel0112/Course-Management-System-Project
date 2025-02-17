#Course Management System
The Course Management System is a web application designed to provide a platform similar to D2L (Desire2Learn) for managing courses, student accounts, events, and more. It is built using Spring Boot for the backend and HTML/CSS/JavaScript for the frontend. The application is deployed on an AWS EC2 instance and is accessible at http://3.132.95.238:8585.

Table of Contents

Features
Technologies Used
Getting Started
Prerequisites
Running the Application
Application Sections
Project Members
Deployment
Usage
Contributing
License
Features

The Course Management System includes the following major sections:

Login / Sign-up: Secure authentication for students and instructors.
Events: Manage and view upcoming events.
Course Catalog: Browse available courses.
Enrollment: Enroll in courses.
Student Notes: Take and manage notes for courses.
Course Detail Page: View detailed information about a course.
Student Accounts: Manage student profiles and accounts.
Discussion: Participate in course-related discussions.
Profile: Update personal information and preferences.
Renting Equipment: Rent equipment for classes.
Advisors Appointment: Schedule appointments with academic advisors.
Technologies Used

Backend: Spring Boot, H2 Database (for local development), AWS RDS (for production).
Frontend: HTML, CSS, JavaScript.
Deployment: AWS EC2, Docker (optional).
Version Control: Git, GitHub.
Other Tools: Postman (for API testing), Maven (for dependency management).
Getting Started

Prerequisites

Java Development Kit (JDK) 17 or higher.
Maven (for building the project).
A modern web browser (Chrome, Firefox, Edge, etc.).
AWS account (for deployment).
Running the Application

Clone the Repository:
bash
Copy
git clone https://github.com/your-username/course-management-system.git
cd course-management-system
Build the Project:
bash
Copy
mvn clean install
Run the Application:
bash
Copy
mvn spring-boot:run
Access the Application:
Open your browser and navigate to http://localhost:8585.
Application Sections

The application is divided into the following sections, each managed by a team member:

Section	Managed By
Events, Student, User	Patel Jay Rashmitbhai
Advisor, Appointment	Reddy Guntaka Satish Harshavardhan
Course Catalog, Enrollment, Student Notes	Puneeth Talluri
Course Details, Instructor, Student Accounts, Discussion	Patel Shivangi
Equipment, Rental	Siddiqui Atif
Deployment

The application is deployed on an AWS EC2 instance and is accessible at http://3.132.95.238:8585.

Deployment Steps:

Set up an EC2 Instance:
Launch an EC2 instance on AWS.
Install Java, Maven, and any other required dependencies.
Deploy the Application:
Copy the built JAR file to the EC2 instance.
Run the application using:
bash
Copy
java -jar course-management-system.jar
Configure Security Groups:
Ensure port 8585 is open for inbound traffic.
Usage

To use the application:

Sign Up: Create a new account using the Sign-up page.
Login: Use the following credentials to log in:
Email: puneeth@gmail.com
Password: puneeth123
Explore: Navigate through the various sections of the application using the homepage.
Contributing

We welcome contributions to the Course Management System! To contribute:

Fork the repository.
Create a new branch for your feature or bugfix.
Commit your changes.
Submit a pull request.
License

This project is licensed under the MIT License. See the LICENSE file for details.

Project Members

Name	Role
Patel Jay Rashmitbhai	Events, Student, User
Reddy Guntaka Satish Harshavardhan	Advisor, Appointment
Puneeth Talluri	Course Catalog, Enrollment, Student Notes
Patel Shivangi	Course Details, Instructor, Student Accounts, Discussion
Siddiqui Atif	Equipment, Rental
Acknowledgments

Special thanks to our instructor and peers for their guidance and support.
Built with ❤️ by the Course Management System team.
