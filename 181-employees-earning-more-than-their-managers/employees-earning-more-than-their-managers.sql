# Write your MySQL query statement below
Select e2.name as Employee
from Employee e1
Inner Join Employee e2 on e1.id = e2.managerId
where e2.salary > e1.salary;