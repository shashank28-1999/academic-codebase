/*
write a sql query to display empno,ename, dname,location of employee
from emp,dept table those are not belongs to 'Dallas' or 'Chicago'
using inner join based on deptno?
*/
use fs;
select empno,ename,dname,location from emp
inner join dept on (emp.deptno=dept.deptno) where location not in('Dallas','Chicago');
