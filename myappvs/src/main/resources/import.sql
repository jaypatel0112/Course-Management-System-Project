-- Insert student data
INSERT INTO students(student_id_number, name, email_id, number) VALUES (123456789, 'ABC', 'ABC@example.com', '2246387532');
INSERT INTO students(student_id_number, name, email_id, number) VALUES (987654321, 'CDE', 'CDE@example.com', '2257865437');
INSERT INTO students(student_id_number, name, email_id, number) VALUES (114365567, 'FGH', 'FGH@example.com', '2235679043');
INSERT INTO students(student_id_number, name, email_id, number) VALUES (978563412, 'IJK', 'IJK@example.com', '2247864538');



-- Insert user data
INSERT INTO users(emailId, password) VALUES ('ABC@example.com', 'ABC@123');
INSERT INTO Users(emailId, password) VALUES ('CDE@example.com', 'CDE@123');
INSERT INTO Users(emailId, password) VALUES ('FGH@example.com', 'FGH@123');
INSERT INTO Users(emailId, password) VALUES ('IJK@example.com', 'IJK@123');

-- Insert advisor data
INSERT INTO advisors(name, email) VALUES ('alice', 'alice@test.com')
INSERT INTO advisors(name, email) VALUES ('bob', 'bob@test.com')
INSERT INTO advisors(name, email) VALUES ('charlie', 'charlie@test.com')


-- Insert into Enrollment table
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (1, 123456789, 101);
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (2, 123456789, 101);
INSERT INTO Enrollment(Enrollment_Id, student_id, courseId) VALUES (3, 987654321, 102);

-- Insert into instructor table
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (1, 'John Doe', 'Experienced software engineer', '08:00:00', 'Building A, Room 101');
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (2, 'Alice Smith', 'Data science expert', '10:00:00', 'Building B, Room 201');
INSERT INTO Instructor(instructorId, instructorName, instructorDescription, meetingHours, instructorCabinLocation) VALUES (3, 'David Brown', 'Network security specialist', '13:00:00', 'Building C, Room 301');

INSERT INTO instructor(instructor_id, instructor_name, instructor_description, meeting_hours, instructor_cabin_location) VALUES (201, 'John Doe', 'Experienced software engineer', '08:00:00', 'Building A, Room 101');
INSERT INTO instructor(instructor_id, instructor_name, instructor_description, meeting_hours, instructor_cabin_location) VALUES (202, 'Alice Smith', 'Data science expert', '10:00:00', 'Building B, Room 201');
INSERT INTO instructor(instructor_id, instructor_name, instructor_description, meeting_hours, instructor_cabin_location) VALUES (203, 'David Brown', 'Network security specialist', '13:00:00', 'Building C, Room 301');
-- Insert into Catalog table
INSERT INTO course_catalog(course_id, course_name, course_description, instructor_id, course_credits) VALUES (101, 'Database Systems', 'Introduction to Database Design', 201, 3);
INSERT INTO course_catalog(course_id, course_name, course_description, instructor_id, course_credits) VALUES (102, 'Machine Learning', 'Advanced machine learning concepts', 202, 4);

-- Insert into Course Description table
INSERT INTO course_description(course_description_id, course_id, instructor_id, room, date, time, meeting_info, materials) VALUES (1, 101, 201, 'Room A', '2024-05-10', '09:00:00', 'Introduction to Programming', 'Lecture Slides');
INSERT INTO course_description(course_description_id, course_id, instructor_id, room, date, time, meeting_info, materials) VALUES (2, 102, 202, 'Room B', '2024-05-12', '14:00:00', 'Advanced Database Management', 'Textbook, Exercises');
--INSERT INTO course_description(courseDescriptionId, courseId, instructorId, room, date, time, meeting_info, materials) VALUES (3, 103, 203, 'Room C', '2024-05-15', '11:00:00', 'Machine Learning Fundamentals', 'Online Resources');

-- Insert into Student Account table
INSERT INTO student_accounts(student_accounts_id, student_id, balance) VALUES (1, 123456789, 100.00);
INSERT INTO student_accounts(student_accounts_id, student_id, balance) VALUES (2, 987654321, 200.00);
INSERT INTO student_accounts(student_accounts_id, student_id, balance) VALUES (3, 114365567, 150.00);


-- Insert initial data into the Inventory table
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (1, 'Laptop 1', 'Laptop', 'Available', 10, 10);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (2, 'Projector 1', 'Projector', 'Rented', 5, 4);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (3, 'Laptop 2', 'Laptop', 'Available', 8, 8);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (4, 'Tablet 1', 'Tablet', 'Available', 7, 7);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (5, 'Projector 2', 'Projector', 'Available', 6, 6);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (6, 'Camera 1', 'Camera', 'Rented', 3, 2);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (7, 'Microphone 1', 'Microphone', 'Available', 12, 12);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (8, 'Laptop 3', 'Laptop', 'Under Maintenance', 9, 9);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (9, 'Projector 3', 'Projector', 'Available', 4, 4);
INSERT INTO inventory(resource_id, resource_name, type, status, max_quantity, available_quantity) VALUES (10, 'Tablet 2', 'Tablet', 'Rented', 5, 4);

-- Insert initial data into the Rentals table
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (1, 101, 2, '2024-04-01', '2024-04-10');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (2, 102, 4, '2024-04-05', '2024-04-12');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (3, 103, 6, '2024-04-07', '2024-04-14');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (4, 104, 10, '2024-04-10', '2024-04-17');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (5, 105, 5, '2024-04-12', '2024-04-19');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (6, 106, 1, '2024-04-15', '2024-04-20');
INSERT INTO rentals (allocation_id, class_id, resource_id, allocation_date, return_date) VALUES (7, 107, 9, '2024-04-18', '2024-04-25');