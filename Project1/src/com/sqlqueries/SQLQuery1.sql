CREATE DATABASE myfriends_db;
USE myfriends_db;

create table myTable(
user_id int primary key,
email varchar(50),
last_name varchar(50)
);

insert into myTable (user_id,email,last_name) values
(4,'abc@sample.com','ab'),
(5,'bc@sample.com','qw'),
(6,'xyz@sample.com','a');

select * from myTable;

--crud operations --

update myTable
set last_name='mk'
where user_id=6;

delete from myTable
where user_id=5;

insert into myTable (user_id,email,last_name) values
(7,'xyzc@sample.com','Go'),
(8,'kavya@sample.com','Go'),
(10,'xyzc@sample.com','Go');

create table myFriends(
Name Varchar(20) primary key,
usn varchar(50),
last_name varchar(50)
);

--This will return a list of all user-defined and system tables in that database.
USE myfriends_db;
GO

SELECT * FROM INFORMATION_SCHEMA.TABLES;

--aggregate functs
--SELECT COUNT(*) FROM Employees;
--SELECT AVG(Age) FROM Employees;
--SELECT MAX(Age) FROM Employees;
--SELECT MIN(Age) FROM Employees;

select * from myTable
where user_id>6;

SELECT * FROM myTable
ORDER BY last_name DESC;  -- or asc


select * from myTable
where user_id=4 or user_id=6;

select * from myTable
where user_id=4 and user_id=6;--doesn't print

update myTable
set last_name='AB' where USER_ID=7;

select * from myTable
where last_name='ab';
