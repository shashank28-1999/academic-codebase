/*List the manager no and the number of employees [ count(*) ] working for those managers in
ascending Mgr no */
use fs;
select mgr,count(*) from emp e1
where (select empno from emp e2 where (e2.empno=e1.mgr))
group by mgr
order by mgr asc;
