--select * from student
--for passport is owning side of the relationship
--insert into student(id,name) values (1,'john');
--insert into student(id,name) values (2,'Alberto');

--insert into passport(id,number,student_id) values(1,'IND001',1);
--insert into passport(id,number,student_id) values(2,'IND002',2);
insert into passport(id,number) values(1,'IND001');
insert into passport(id,number) values(2,'IND002');
insert into student(id,name,passport_id) values(1,'jack',1);
insert into student(id,name,passport_id) values(2,'john',2);
