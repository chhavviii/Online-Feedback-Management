CREATE DATABASE feedback_db;

USE feedback_db;

CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    comments TEXT NOT NULL,
    submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

select * from feedback;


CREATE TABLE admin_user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

ALTER TABLE feedback ADD COLUMN status VARCHAR(20) DEFAULT 'Pending';
ALTER TABLE feedback ADD COLUMN category VARCHAR(50) DEFAULT 'General';

SELECT * FROM feedback WHERE category = 'great';

