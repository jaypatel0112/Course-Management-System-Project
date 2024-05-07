



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
INSERT INTO Course_Catalog (courseId, courseName, Course_Description, Course_Instructor, Course_Credits) VALUES (101, 'Database Systems', 'Introduction to Database Design', 21251, 3);
INSERT INTO Course_Catalog (courseId, courseName, Course_Description, Course_Instructor, Course_Credits) VALUES (102, 'Machine Learning', 'Advanced machine learning concepts', 21351, 4);

-- Insert into Enrollment table
INSERT INTO Enrollment (Enrollment_Id, student_id, courseId) VALUES (1, 123456789, 101);
INSERT INTO Enrollment (Enrollment_Id, student_id, courseId) VALUES (2, 123456789, 101);
INSERT INTO Enrollment (Enrollment_Id, student_id, courseId) VALUES (3, 987654321, 102);


-- Insert initial data into the Equipment table
INSERT INTO inventory (resource_id, resource_name, type, status) VALUES (1, 'Laptop 1', 'Laptop', 'Available');
INSERT INTO inventory (resource_id, resource_name, type, status) VALUES (2, 'Projector 1', 'Projector', 'Rented');

-- Insert initial data into the Rentals table
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (1, 101, 2, '2024-04-01', '2024-04-10');

