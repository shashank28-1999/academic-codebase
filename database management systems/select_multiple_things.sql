/*Write a SQL query to 3. Display the names of employees working in
department number 10 or 20 or 40
or employees working as clerks, salesman or analyst. */
use fs;
select ename from emp where deptno in (10,20,40) or job in ('clerk','salesman','analyst');
