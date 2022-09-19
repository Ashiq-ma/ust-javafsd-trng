use ustDB;
create table Employee(EMP_ID int not null primary key,
MANAGER_ID int,FIRST_NAME varchar(50) not null,LAST_NAME varchar(50) not null,EMP_TITLE varchar(50) not null,SALARY varchar(50) not null,JOINING_DATE varchar(50) not null,DEP varchar(50) not null);
insert into Employee values
(1,NULL,"Monika","Arora","Mangaer",100000,"02/20/14 9:00","HR"),
(2,1,"Niharika","Verma","Executive",80000,"06/11/14 9:00","Admin"),
(3,1,"Vishal","Singhal","Executive",300000,"02/20/14 9:00","HR"),
(4,NULL,"Amitabh","Singh","Manager",500000,"02/20/14 9:00","Admin"),
(5,4,"Vivek","Bhati","Asst.Mangaer",500000,"06/11/14 9:00","Admin"),
(6,5,"Vipul","Diwan","Executive",200000,"06/11/14 9:00","Account"),
(7,4,"Satish","Kumar","Lead",75000,"01/20/14 9:00","Account"),
(8,4,"Geethika","Chauhan","Lead",90000,"04/11/14 9:00","Admin");
Select FIRST_NAME,LAST_NAME FROM Employee WHERE SALARY BETWEEN 50000 AND 100000;
Select e1.FIRST_NAME as Employee_name,e2.FIRST_NAME as Manager_name where e1.EMP_ID=e2.MANAGER_ID;






