# Write your MySQL query statement below
select unique_id, name
from Employees as a
left join EmployeeUNI as e
on a.id = e.id;