/*
write a sql query to display empno,ename, dname of employee
from emp,dept table those are working under manager id(7698)
using inner join based on id?
*/
use fs;
select empno,ename,dname from emp
inner join dept on(emp.mgr=7698);
