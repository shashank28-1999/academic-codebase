/* Write a SQL Query to
i) to print the names and salaries of employees in descending order of salary.
ii) Find the Second highest sal of EMP table
*/
use fs;
select ename,sal from emp
order by sal desc;
select max(sal) from emp where sal<(select max(sal) from emp);
