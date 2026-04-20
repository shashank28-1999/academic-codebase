/* Practice */
use fs;
select ename,sal,grade from emp
inner join salgrade on(sal between losal and hisal);
