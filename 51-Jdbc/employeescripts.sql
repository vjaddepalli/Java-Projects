create database TrainingDB;
use TrainingDB;
create table TEMPLOYEES(
	ID int auto_increment,
	NAME varchar(25) not null,
	DOJ date,
	GRADE char(1),
	BASIC_SALARY double not null,
	GENDER char(1)  not null,
	constraint emp_id_pk primary key(ID)
);

select sum(basic_salary) from TEMPLOYEES;