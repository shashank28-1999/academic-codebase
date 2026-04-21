-- Create database
CREATE DATABASE IF NOT EXISTS bookstore;
USE bookstore;

-- Create users table
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    mobile VARCHAR(15),
    address TEXT
);

-- Insert sample data
INSERT INTO users (username, password, email, mobile, address) VALUES
('ravi_kumar',   'pass123', 'ravi.kumar@email.com',   '9876543210', 'Hyderabad'),
('priya_sharma', 'pass123', 'priya.sharma@email.com', '9123456780', 'Mumbai'),
('arjun_nair',   'pass123', 'arjun.nair@email.com',   '9988776655', 'Bangalore'),
('sneha_reddy',  'pass123', 'sneha.reddy@email.com',  '8877665544', 'Chennai'),
('kiran_mehta',  'pass123', 'kiran.mehta@email.com',  '7766554433', 'Delhi');
