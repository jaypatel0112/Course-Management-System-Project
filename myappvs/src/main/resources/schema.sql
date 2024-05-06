CREATE TABLE IF NOT EXISTS Students (
    studentIdNumber INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    emailId VARCHAR(255) NOT NULL,
    number VARCHAR(20) NOT NULL
);
-- Create Users table if it doesn't exist
CREATE TABLE IF NOT EXISTS Users (
    emailId VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

--CREATE TABLE IF NOT EXISTS course_description (
    --course_id BIGINT PRIMARY KEY,
    --date DATETIME(6),
    --instructor_id BIGINT,
    --materials VARCHAR(255),
    --meeting_info VARCHAR(255),
    --room VARCHAR(255),
    --time TIME(6)
--);