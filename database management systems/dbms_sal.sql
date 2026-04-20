/* display the names of employees in descending order whose sal is more than 'BLAKE'
-- use database fs ,Table names emp, dept */
use fs;
select ename from emp where sal>(select sal from emp where ename='BLAKE')
order by ename desc;
