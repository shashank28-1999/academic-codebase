/*Display dname, grade, No. of emps[ count(*) ] where at least two emps are clerks */
use fs;
select dname,grade,count(*) from emp
inner join dept on(emp.deptno=dept.deptno)
inner join salgrade on(sal between losal and hisal) where job='clerk'
group by emp.deptno having count(*)>=2;
