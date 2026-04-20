/* Create the trigger (before insert) on student table and execute it.
   Perform an insert operation on student table and execute it.
   display tables in the following order
   1. select * from student;
   2. select * from student_grade;
*/

delimiter $$

create trigger complete
before insert on student 
for each row
begin
    declare total_marks int(3);
    declare gpa decimal(10,2);

    set total_marks = new.c_marks + new.java_marks + new.dbms_marks;
    set gpa = total_marks / 30.0;

    insert into student_grade values (new.rollno, total_marks, gpa);
end$$

delimiter ;

insert into student values (101, 'venkat', 76, 78, 76);

select * from student;
select * from student_grade;