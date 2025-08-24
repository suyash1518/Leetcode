# Write your MySQL query statement below
select e.name
from Employee e
join Employee ee
ON e.id = ee.managerId
group by e.id, e.name
having count(ee.id) >= 5