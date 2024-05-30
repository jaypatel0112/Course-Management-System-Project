



-- Insert student data
INSERT INTO Students(studentIdNumber, name, emailId, number) VALUES (123456789, 'ABC', 'ABC@example.com', '2246387532');
INSERT INTO Students(studentIdNumber, name, emailId, number) VALUES (987654321, 'CDE', 'CDE@example.com', '2257865437');
INSERT INTO Students(studentIdNumber, name, emailId, number) VALUES (214365879, 'FGH', 'FGH@example.com', '2235679043');
INSERT INTO Students(studentIdNumber, name, emailId, number) VALUES (978563412, 'IJK', 'IJK@example.com', '2247864538');



-- Insert user data
INSERT INTO Users(emailId, password) VALUES ('ABC@example.com', 'ABC@123');
INSERT INTO Users(emailId, password) VALUES ('CDE@example.com', 'CDE@123');
INSERT INTO Users(emailId, password) VALUES ('FGH@example.com', 'FGH@123');
INSERT INTO Users(emailId, password) VALUES ('IJK@example.com', 'IJK@123');

-- Insert advisor data
INSERT INTO advisors(name, email) VALUES ('alice', 'alice@test.com')
INSERT INTO advisors(name, email) VALUES ('bob', 'bob@test.com')
INSERT INTO advisors(name, email) VALUES ('charlie', 'charlie@test.com')

-- Insert into Catalog table
INSERT INTO Course_Catalog(courseId, courseName, Course_Description, Instructor_ID, Course_Credits) VALUES (101, 'Database Systems', 'Introduction to Database Design', 21251, 3);
INSERT INTO Course_Catalog(courseId, courseName, Course_Description, Instructor_ID, Course_Credits) VALUES (102, 'Machine Learning', 'Advanced machine learning concepts', 21351, 4);

-- Insert into Enrollment table
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (1, 123456789, 101);
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (2, 123456789, 101);
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (3, 987654321, 102);

-- Insert into instructor table
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (1, 'John Doe', 'Experienced software engineer', '08:00:00', 'Building A, Room 101');
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (2, 'Alice Smith', 'Data science expert', '10:00:00', 'Building B, Room 201');
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (3, 'David Brown', 'Network security specialist', '13:00:00', 'Building C, Room 301');

-- Insert into Course Description table
INSERT INTO Course_Description(courseDescriptionId, courseId, instructorId, room, date, time, meetingInfo, materials) VALUES (1, 101, 201, 'Room A', '2024-05-10', '09:00:00', 'Introduction to Programming', 'Lecture Slides');
INSERT INTO Course_Description(courseDescriptionId, courseId, instructorId, room, date, time, meetingInfo, materials) VALUES (2, 102, 202, 'Room B', '2024-05-12', '14:00:00', 'Advanced Database Management', 'Textbook, Exercises');
INSERT INTO Course_Description(courseDescriptionId, courseId, instructorId, room, date, time, meetingInfo, materials) VALUES (3, 103, 203, 'Room C', '2024-05-15', '11:00:00', 'Machine Learning Fundamentals', 'Online Resources');

-- Insert into Student Account table
INSERT INTO Student_Accounts(studentAccountsId, student_id, balance) VALUES (1, 101, 100.00);
INSERT INTO Student_Accounts(studentAccountsId, student_id, balance) VALUES (2, 102, 200.00);
INSERT INTO Student_Accounts(studentAccountsId, student_id, balance) VALUES (3, 103, 150.00);

