/* Write a SQL Query to Display the total salary drawn by analyst
working in dept no 20.*/
use fs;
select sum(sal+ifnull(comm,0)) salary from emp where deptno=20 && job='analyst';
