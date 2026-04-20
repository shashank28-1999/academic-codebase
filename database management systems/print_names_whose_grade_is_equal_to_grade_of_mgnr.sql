/* Practice */
use fs;
select ename from emp e1
inner join salgrade on(sal between losal and hisal)
where grade=(select grade from emp e2
inner join salgrade on(sal between losal and hisal)
where e2.empno=e1.mgr);
