/*
Write a query to display empno,ename,sal,deptno,dname,location
and the non matching records come from first table?
*/
use fs;
select empno,ename,sal,emp.deptno,dname,location from emp
left outer join dept on(emp.deptno=dept.deptno);
