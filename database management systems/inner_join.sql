/*
Write a query to combine the empno,ename,sal,dname,location
of (employee and department)?
*/
use fs;
select empno,ename,sal,dname,location from emp
inner join dept on (emp.deptno=dept.deptno);
