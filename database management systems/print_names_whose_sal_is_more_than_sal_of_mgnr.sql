/* Practice */
use fs;
select ename from emp e1 where sal>(select sal from emp e2 where e2.empno=e1.mgr);
