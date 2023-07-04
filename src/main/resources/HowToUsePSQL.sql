--Create database command
CREATE DATABASE reminders;

--List the available databases
\l

--Connect to a specific database
\c reminders

--List the available tables on the connected database
\d

--Describe a particular table from a given database
\d users

SELECT * FROM users;
INSERT INTO users VALUES (1, true, 'pwd', 'ADMIN', 'admin');