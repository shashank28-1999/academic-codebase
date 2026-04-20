/*
Write a correlated sub-query to list out the employees who earn more than
the average salary of their department use fs db & table names emp ,dept
*/
use fs;
select ename from emp E1 where sal>(select avg(sal) from emp E2 where E2.deptno=E1.deptno);
