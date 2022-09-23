create database sba3;
use sba3;
create table worker(WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	FIRST_NAME VARCHAR(25),
	LAST_NAME VARCHAR(25),
	SALARY INT(15),
	JOINING_DATE DATETIME,
	DEPARTMENT VARCHAR(25)
);
SELECT * FROM WORKER;
INSERT INTO WORKER VALUES(001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
		(002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
		(003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
		(004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
		(005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
		(006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
		(007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
        SELECT * FROM WORKER;
        
	create table bonus(WORKER_REF_ID INT,
	BONUS_AMOUNT INT(10),
	BONUS_DATE DATETIME,
    FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
    
	);
    
    insert into bonus values
		(001, 5000, '2016-02-20 00:00:00'),
		(002, 3000, '2016-06-11 00:00:00'),
		(003, 4000, '2016-02-20 00:00:00'),
		(001, 4500, '2016-02-20 00:00:00'),
		(002, 3500, '2016-06-11 00:00:00');
        select * from bonus;
        
        CREATE TABLE Title (
	WORKER_REF_ID INT,
	WORKER_TITLE CHAR(25),
	AFFECTED_FROM DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker(WORKER_ID)
        
);
INSERT INTO Title VALUES
 (001, 'Manager', '2016-02-20 00:00:00'),
 (002, 'Executive', '2016-06-11 00:00:00'),
 (008, 'Executive', '2016-06-11 00:00:00'),
 (005, 'Manager', '2016-06-11 00:00:00'),
 (004, 'Asst. Manager', '2016-06-11 00:00:00'),
 (007, 'Executive', '2016-06-11 00:00:00'),
 (006, 'Lead', '2016-06-11 00:00:00'),
 (003, 'Lead', '2016-06-11 00:00:00');
 select * from title;
 
 Select FIRST_NAME AS WORKER_NAME from Worker;
 Select upper(FIRST_NAME) from worker ;
 select DISTINCT DEPARTMENT  FROM WORKER ;
 SELECT SUBSTRING(FIRST_NAME,1,3) FROM WORKER;
 SELECT * FROM WORKER WHERE DEPARTMENT="Admin";
 select * from worker where FIRST_NAME like 'a%';
 select * from worker where FIRST_NAME like '%a';

