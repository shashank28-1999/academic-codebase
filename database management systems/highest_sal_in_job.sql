/* Display the names of employees who earn highest salaries in their respective job groups */
use fs;

select ename 
from emp 
where sal in (
    select max(sal) 
    from emp 
    group by job
);