CREATE DATABASE IF NOT EXISTS demo;

CREATE USER 'demouser'@'%' IDENTIFIED BY 'geheim';
GRANT ALL PRIVILEGES ON `demo`.* TO 'demouser'@'%' WITH GRANT OPTION;

CREATE TABLE demo.person(
	ID int NOT NULL AUTO_INCREMENT,
    FIRSTNAME varchar(255) NOT NULL,
    LASTNAME varchar(255) NOT NULL,
    AGE int,
    PRIMARY KEY (ID)
);

INSERT INTO demo.person(FIRSTNAME, LASTNAME, AGE)
VALUES ('TestLastname', 'TestFirstname', 28);