/* display the names of employees who joined in 1996 & 2000 only.
display the names of employees in the order of joining date */
use fs;
select ename from emp where hiredate like '__96%' or hiredate like '__00%'
order by hiredate asc;
