/* Write a SQL query to Display the name of the employee along with their
annual salary (Sal * 12).  The name of the employee earning
highest annual salary should appear first.
NOTE: Column name for annual salary is 'Annual'
*/

use fs;
select ename,(sal+ifnull(comm,0))*12 Annual from emp
order by Annual desc;
