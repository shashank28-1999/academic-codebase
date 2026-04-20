/*Write an SQL Query 2. Display the list of employee names who
have joined the company before '1993-06-30' and after '1996-12-31. */
use fs;
select ename from emp where hiredate not between '1993-06-30' and '1996-12-31';
