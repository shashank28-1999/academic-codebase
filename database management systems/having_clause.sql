/*Display the department numbers and count(*) with more than three employees in each group */
use fs;
select deptno,count(*) from emp
group by deptno having count(*)>3;
