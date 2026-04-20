/* Display dept numbers and total number of employees( count(*) ) within each group */
use fs;
select deptno,count(*) from emp
group by deptno;
